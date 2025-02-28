package potionstudios.byg.common.entity.npc;

import blue.endless.jankson.api.SyntaxError;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.Util;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import potionstudios.byg.BYG;
import potionstudios.byg.util.ModPlatform;
import potionstudios.byg.util.codec.CodecUtil;
import potionstudios.byg.util.jankson.JanksonJsonOps;
import potionstudios.byg.util.jankson.JanksonUtil;
import potionstudios.byg.util.lazy.LazySupplier;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public record TradesConfig(boolean enabled,
    Map<VillagerProfession, Int2ObjectMap<VillagerTrades.ItemListing[]>> tradesByProfession,
    Int2ObjectMap<VillagerTrades.ItemListing[]> wanderingTraderTrades) {

    public static final Supplier<Path> CONFIG_PATH = () -> ModPlatform.INSTANCE.configPath().resolve("trades.json5");

    public static TradesConfig INSTANCE = null;


    public static final LazySupplier<TradesConfig> DEFAULT = new LazySupplier<>(() -> new TradesConfig(true, BYGVillagerTrades.TRADES.get(), BYGVillagerTrades.WANDERING_TRADER_TRADES.get()));

    public static final Codec<TradesConfig> CODEC = RecordCodecBuilder.create(builder ->
        builder.group(
            Codec.BOOL.fieldOf("visible").orElse(true).forGetter(config -> config.enabled),
            Codec.unboundedMap(CodecUtil.VILLAGER_PROFESSION_CODEC, BYGVillagerTrades.createRangeCheckedKeyMap(1, 5)).fieldOf("trades_by_profession").forGetter(config -> config.tradesByProfession),
            BYGVillagerTrades.createRangeCheckedKeyMap(1, 2).fieldOf("wandering_trader_trades").forGetter(config -> config.wanderingTraderTrades)
        ).apply(builder, TradesConfig::new)
    );

    public static TradesConfig getConfig() {
        return getConfig(false, false);
    }

    public static TradesConfig getConfig(boolean serialize, boolean recreate) {
        if (INSTANCE == null || serialize || recreate) {
            INSTANCE = readConfig(recreate);
        }

        return INSTANCE;
    }

    public static void setConfigInstance(TradesConfig config) {
        INSTANCE = config;
    }

    private static TradesConfig readConfig(boolean recreate) {
        final Path path = CONFIG_PATH.get();

        if (!path.toFile().exists() || recreate) {
            createConfig(path);
        }
        BYG.LOGGER.info(String.format("\"%s\" was read.", path.toString()));

        try {
            return JanksonUtil.readConfig(path, CODEC, JanksonJsonOps.INSTANCE);
        } catch (IOException | SyntaxError e) {
            throw new RuntimeException(e);
        }
    }

    private static void createConfig(Path path) {
        HashMap<String, String> comments = Util.make(new HashMap<>(), map -> {
            map.put("visible", "Whether this file appends villager/wandering trader trades.");
            map.put("trades_by_profession", "Trades for a given villager profession. Trade levels are in the range of 1-5");
            map.put("wandering_trader_trades", "Trades for the wandering trader. Trades in \"1\" are \"generic\" trades. Trades appearing in \"2\" are \"rare\" trades.");
            map.put("wandering_trader_trades.1", "Trades listed here are \"generic\" and a few(not only from these listed here but from other mods/vanilla also) are picked when a wandering trader spawns.");
            map.put("wandering_trader_trades.2", "Trades listed here are \"rare\" and only one(not only from these listed here but from other mods/vanilla also) is picked when a wandering trader spawns.");
        });
        JanksonUtil.createConfig(path, CODEC, JanksonUtil.HEADER_CLOSED, comments, JanksonJsonOps.INSTANCE, DEFAULT.get());
    }
}