package potionstudios.byg.common;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import potionstudios.byg.BYG;
import potionstudios.byg.common.block.BYGBlocks;
import potionstudios.byg.mixin.access.AxeItemAccess;

import java.util.IdentityHashMap;
import java.util.Map;

public class BYGStrippables {

    public static void strippableLogsBYG() {
        BYG.LOGGER.debug("BYG: Adding strippable Blocks...");

        Map<Block, Block> stripables = new IdentityHashMap<>(AxeItemAccess.byg_getStrippables());

        stripables.put(BYGBlocks.ASPEN_LOG.get(), BYGBlocks.STRIPPED_ASPEN_LOG.get());
        stripables.put(BYGBlocks.BAOBAB_LOG.get(), BYGBlocks.STRIPPED_BAOBAB_LOG.get());
        stripables.put(BYGBlocks.BLUE_ENCHANTED_LOG.get(), BYGBlocks.STRIPPED_BLUE_ENCHANTED_LOG.get());
        stripables.put(BYGBlocks.CHERRY_LOG.get(), BYGBlocks.STRIPPED_CHERRY_LOG.get());
        stripables.put(BYGBlocks.CIKA_LOG.get(), BYGBlocks.STRIPPED_CIKA_LOG.get());
        stripables.put(BYGBlocks.CYPRESS_LOG.get(), BYGBlocks.STRIPPED_CYPRESS_LOG.get());
        stripables.put(BYGBlocks.EBONY_LOG.get(), BYGBlocks.STRIPPED_EBONY_LOG.get());
        stripables.put(BYGBlocks.FIR_LOG.get(), BYGBlocks.STRIPPED_FIR_LOG.get());
        stripables.put(BYGBlocks.GREEN_ENCHANTED_LOG.get(), BYGBlocks.STRIPPED_GREEN_ENCHANTED_LOG.get());
        stripables.put(BYGBlocks.HOLLY_LOG.get(), BYGBlocks.STRIPPED_HOLLY_LOG.get());
        stripables.put(BYGBlocks.JACARANDA_LOG.get(), BYGBlocks.STRIPPED_JACARANDA_LOG.get());
        stripables.put(BYGBlocks.MAHOGANY_LOG.get(), BYGBlocks.STRIPPED_MAHOGANY_LOG.get());
        stripables.put(BYGBlocks.MANGROVE_LOG.get(), BYGBlocks.STRIPPED_MANGROVE_LOG.get());
        stripables.put(BYGBlocks.MAPLE_LOG.get(), BYGBlocks.STRIPPED_MAPLE_LOG.get());
        stripables.put(BYGBlocks.PALO_VERDE_LOG.get(), BYGBlocks.STRIPPED_PALO_VERDE_LOG.get());
        stripables.put(BYGBlocks.PINE_LOG.get(), BYGBlocks.STRIPPED_PINE_LOG.get());
        stripables.put(BYGBlocks.RAINBOW_EUCALYPTUS_LOG.get(), BYGBlocks.STRIPPED_RAINBOW_EUCALYPTUS_LOG.get());
        stripables.put(BYGBlocks.REDWOOD_LOG.get(), BYGBlocks.STRIPPED_REDWOOD_LOG.get());
        stripables.put(BYGBlocks.SKYRIS_LOG.get(), BYGBlocks.STRIPPED_SKYRIS_LOG.get());
        stripables.put(BYGBlocks.WILLOW_LOG.get(), BYGBlocks.STRIPPED_WILLOW_LOG.get());
        stripables.put(BYGBlocks.WITCH_HAZEL_LOG.get(), BYGBlocks.STRIPPED_WITCH_HAZEL_LOG.get());
        stripables.put(BYGBlocks.ZELKOVA_LOG.get(), BYGBlocks.STRIPPED_ZELKOVA_LOG.get());
        stripables.put(BYGBlocks.SYTHIAN_STEM.get(), BYGBlocks.STRIPPED_SYTHIAN_STEM.get());
        stripables.put(BYGBlocks.PALM_LOG.get(), BYGBlocks.STRIPPED_PALM_LOG.get());
        stripables.put(BYGBlocks.LAMENT_LOG.get(), BYGBlocks.STRIPPED_LAMENT_LOG.get());
        stripables.put(BYGBlocks.WITHERING_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
        stripables.put(BYGBlocks.ETHER_LOG.get(), BYGBlocks.STRIPPED_ETHER_LOG.get());
        stripables.put(BYGBlocks.NIGHTSHADE_LOG.get(), BYGBlocks.STRIPPED_NIGHTSHADE_LOG.get());
        stripables.put(BYGBlocks.BULBIS_STEM.get(), BYGBlocks.STRIPPED_BULBIS_LOG.get());
        stripables.put(BYGBlocks.EMBUR_PEDU.get(), BYGBlocks.STRIPPED_EMBUR_PEDU.get());
        stripables.put(BYGBlocks.FUNGAL_IMPARIUS_STEM.get(), BYGBlocks.IMPARIUS_STEM.get());

        stripables.put(BYGBlocks.ASPEN_WOOD.get(), BYGBlocks.STRIPPED_ASPEN_WOOD.get());
        stripables.put(BYGBlocks.BAOBAB_WOOD.get(), BYGBlocks.STRIPPED_BAOBAB_WOOD.get());
        stripables.put(BYGBlocks.BLUE_ENCHANTED_WOOD.get(), BYGBlocks.STRIPPED_BLUE_ENCHANTED_WOOD.get());
        stripables.put(BYGBlocks.CHERRY_WOOD.get(), BYGBlocks.STRIPPED_CHERRY_WOOD.get());
        stripables.put(BYGBlocks.CIKA_WOOD.get(), BYGBlocks.STRIPPED_CIKA_WOOD.get());
        stripables.put(BYGBlocks.CYPRESS_WOOD.get(), BYGBlocks.STRIPPED_CYPRESS_WOOD.get());
        stripables.put(BYGBlocks.EBONY_WOOD.get(), BYGBlocks.STRIPPED_EBONY_WOOD.get());
        stripables.put(BYGBlocks.FIR_WOOD.get(), BYGBlocks.STRIPPED_FIR_WOOD.get());
        stripables.put(BYGBlocks.GREEN_ENCHANTED_WOOD.get(), BYGBlocks.STRIPPED_GREEN_ENCHANTED_WOOD.get());
        stripables.put(BYGBlocks.HOLLY_WOOD.get(), BYGBlocks.STRIPPED_HOLLY_WOOD.get());
        stripables.put(BYGBlocks.JACARANDA_WOOD.get(), BYGBlocks.STRIPPED_JACARANDA_WOOD.get());
        stripables.put(BYGBlocks.MAHOGANY_WOOD.get(), BYGBlocks.STRIPPED_MAHOGANY_WOOD.get());
        stripables.put(BYGBlocks.MANGROVE_WOOD.get(), BYGBlocks.STRIPPED_MANGROVE_WOOD.get());
        stripables.put(BYGBlocks.MAPLE_WOOD.get(), BYGBlocks.STRIPPED_MAPLE_WOOD.get());
        stripables.put(BYGBlocks.PALO_VERDE_WOOD.get(), BYGBlocks.STRIPPED_PALO_VERDE_WOOD.get());
        stripables.put(BYGBlocks.PINE_WOOD.get(), BYGBlocks.STRIPPED_PINE_WOOD.get());
        stripables.put(BYGBlocks.RAINBOW_EUCALYPTUS_WOOD.get(), BYGBlocks.STRIPPED_RAINBOW_EUCALYPTUS_WOOD.get());
        stripables.put(BYGBlocks.REDWOOD_WOOD.get(), BYGBlocks.STRIPPED_REDWOOD_WOOD.get());
        stripables.put(BYGBlocks.SKYRIS_WOOD.get(), BYGBlocks.STRIPPED_SKYRIS_WOOD.get());
        stripables.put(BYGBlocks.WILLOW_WOOD.get(), BYGBlocks.STRIPPED_WILLOW_WOOD.get());
        stripables.put(BYGBlocks.WITCH_HAZEL_WOOD.get(), BYGBlocks.STRIPPED_WITCH_HAZEL_WOOD.get());
        stripables.put(BYGBlocks.ZELKOVA_WOOD.get(), BYGBlocks.STRIPPED_ZELKOVA_WOOD.get());
        stripables.put(BYGBlocks.SYTHIAN_HYPHAE.get(), BYGBlocks.STRIPPED_SYTHIAN_HYPHAE.get());
        stripables.put(BYGBlocks.PALM_WOOD.get(), BYGBlocks.STRIPPED_PALM_WOOD.get());
        stripables.put(BYGBlocks.LAMENT_WOOD.get(), BYGBlocks.STRIPPED_LAMENT_WOOD.get());
        stripables.put(BYGBlocks.WITHERING_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
        stripables.put(BYGBlocks.ETHER_WOOD.get(), BYGBlocks.STRIPPED_ETHER_WOOD.get());
        stripables.put(BYGBlocks.NIGHTSHADE_WOOD.get(), BYGBlocks.STRIPPED_NIGHTSHADE_WOOD.get());
        stripables.put(BYGBlocks.BULBIS_WOOD.get(), BYGBlocks.STRIPPED_BULBIS_WOOD.get());
        stripables.put(BYGBlocks.EMBUR_HYPHAE.get(), BYGBlocks.STRIPPED_EMBUR_HYPHAE.get());
        stripables.put(BYGBlocks.FUNGAL_IMPARIUS_HYPHAE.get(), BYGBlocks.IMPARIUS_HYPHAE.get());

        AxeItemAccess.byg_setStripables(stripables);
        BYG.LOGGER.info("BYG: Added strippable Blocks...");

    }
}
