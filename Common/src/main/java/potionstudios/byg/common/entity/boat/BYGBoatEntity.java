package potionstudios.byg.common.entity.boat;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.IndirectEntityDamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import potionstudios.byg.common.block.BYGBlocks;
import potionstudios.byg.common.entity.BYGEntities;
import potionstudios.byg.common.item.BYGItems;
import potionstudios.byg.mixin.access.BoatEntityAccess;

@SuppressWarnings("EntityConstructor")
public class BYGBoatEntity extends Boat {
    private static final EntityDataAccessor<Integer> BYG_BOAT_TYPE = SynchedEntityData.defineId(BYGBoatEntity.class, EntityDataSerializers.INT);


    public BYGBoatEntity(Level worldIn, double x, double y, double z) {
        this(BYGEntities.BOAT.get(), worldIn);
        this.setPos(x, y, z);
        this.setDeltaMovement(Vec3.ZERO);
        this.xo = x;
        this.yo = y;
        this.zo = z;
    }

    public BYGBoatEntity(EntityType<? extends Boat> boatEntityType, Level worldType) {
        super(boatEntityType, worldType);
    }

    @Override
    public Item getDropItem() {
        return switch (this.getBYGBoatType()) {
            default -> BYGItems.ASPEN_BOAT.get();
            case BAOBAB -> BYGItems.BAOBAB_BOAT.get();
            case BLUE_ENCHANTED -> BYGItems.BLUE_ENCHANTED_BOAT.get();
            case CHERRY -> BYGItems.CHERRY_BOAT.get();
            case CIKA -> BYGItems.CIKA_BOAT.get();
            case CYPRESS -> BYGItems.CYPRESS_BOAT.get();
            case EBONY -> BYGItems.EBONY_BOAT.get();
            case FIR -> BYGItems.FIR_BOAT.get();
            case GREEN_ENCHANTED -> BYGItems.GREEN_ENCHANTED_BOAT.get();
            case HOLLY -> BYGItems.HOLLY_BOAT.get();
            case JACARANDA -> BYGItems.JACARANDA_BOAT.get();
            case MAHOGANY -> BYGItems.MAHOGANY_BOAT.get();
            case MANGROVE -> BYGItems.MANGROVE_BOAT.get();
            case MAPLE -> BYGItems.MAPLE_BOAT.get();
            case PINE -> BYGItems.PINE_BOAT.get();
            case RAINBOW_EUCALYPTUS -> BYGItems.RAINBOW_EUCALYPTUS_BOAT.get();
            case REDWOOD -> BYGItems.REDWOOD_BOAT.get();
            case SKYRIS -> BYGItems.SKYRIS_BOAT.get();
            case WILLOW -> BYGItems.WILLOW_BOAT.get();
            case WITCH_HAZEL -> BYGItems.WITCH_HAZEL_BOAT.get();
            case ZELKOVA -> BYGItems.ZELKOVA_BOAT.get();
            case PALM -> BYGItems.PALM_BOAT.get();
        };
    }

    public Block getPlanks() {
        return switch (this.getBYGBoatType()) {
            default -> BYGBlocks.ASPEN_PLANKS.get();
            case BAOBAB -> BYGBlocks.BAOBAB_PLANKS.get();
            case BLUE_ENCHANTED -> BYGBlocks.BLUE_ENCHANTED_PLANKS.get();
            case CHERRY -> BYGBlocks.CHERRY_PLANKS.get();
            case CIKA -> BYGBlocks.CIKA_PLANKS.get();
            case CYPRESS -> BYGBlocks.CYPRESS_PLANKS.get();
            case EBONY -> BYGBlocks.EBONY_PLANKS.get();
            case FIR -> BYGBlocks.FIR_PLANKS.get();
            case GREEN_ENCHANTED -> BYGBlocks.GREEN_ENCHANTED_PLANKS.get();
            case HOLLY -> BYGBlocks.HOLLY_PLANKS.get();
            case JACARANDA -> BYGBlocks.JACARANDA_PLANKS.get();
            case MAHOGANY -> BYGBlocks.MAHOGANY_PLANKS.get();
            case MANGROVE -> BYGBlocks.MANGROVE_PLANKS.get();
            case MAPLE -> BYGBlocks.MAPLE_PLANKS.get();
            case PALM -> BYGBlocks.PALM_PLANKS.get();
            case PINE -> BYGBlocks.PINE_PLANKS.get();
            case RAINBOW_EUCALYPTUS -> BYGBlocks.RAINBOW_EUCALYPTUS_PLANKS.get();
            case REDWOOD -> BYGBlocks.REDWOOD_PLANKS.get();
            case SKYRIS -> BYGBlocks.SKYRIS_PLANKS.get();
            case WILLOW -> BYGBlocks.WILLOW_PLANKS.get();
            case WITCH_HAZEL -> BYGBlocks.WITCH_HAZEL_PLANKS.get();
            case ZELKOVA -> BYGBlocks.ZELKOVA_PLANKS.get();
        };
    }

    public BYGType getBYGBoatType() {
        return BYGType.byId(this.entityData.get(BYG_BOAT_TYPE));
    }

    public void setBYGBoatType(BYGType boatBYGType) {
        this.entityData.set(BYG_BOAT_TYPE, boatBYGType.ordinal());
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(BYG_BOAT_TYPE, BYGType.ASPEN.ordinal());
    }


    @Override
    protected void addAdditionalSaveData(CompoundTag compound) {
        compound.putString("BYGType", this.getBYGBoatType().getName());
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag compound) {
        if (compound.contains("BYGType", 8)) {
            this.setBYGBoatType(BYGType.getTypeFromString(compound.getString("BYGType")));
        }
    }

    @Override
    public void animateHurt() {
        this.setHurtDir(-this.getHurtDir());
        this.setHurtTime(10);
        this.setDamage(this.getDamage() * 11.0F);
    }


    @Override
    protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
        ((BoatEntityAccess) this).byg_setLastYd(this.getDeltaMovement().y);
        if (!this.isPassenger()) {
            if (onGroundIn) {
                if (this.fallDistance > 3.0F) {
                    if (((BoatEntityAccess) this).byg_getStatusField() != Boat.Status.ON_LAND) {
                        this.fallDistance = 0.0F;
                        return;
                    }

                    this.causeFallDamage(this.fallDistance, 1.0F, DamageSource.FALL);
                    if (!this.level.isClientSide && !this.isRemoved()) {
                        this.kill();
                        if (this.level.getGameRules().getBoolean(GameRules.RULE_DOENTITYDROPS)) {
                            for (int i = 0; i < 3; ++i) {
                                this.spawnAtLocation(this.getPlanks());
                            }

                            for (int j = 0; j < 2; ++j) {
                                this.spawnAtLocation(Items.STICK);
                            }

                            this.spawnAtLocation(Blocks.AIR);
                        }
                    }
                }

                this.fallDistance = 0.0F;
            } else if (!this.level.getFluidState((new BlockPos(this.getX(), this.getY(), this.getZ()).below())).is(FluidTags.WATER) && y < 0.0D) {
                this.fallDistance = (float) ((double) this.fallDistance - y);
            }

        }
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (this.isInvulnerableTo(source)) {
            return false;
        } else if (!this.level.isClientSide && !this.isRemoved()) {
            if (source instanceof IndirectEntityDamageSource && source.getEntity() != null && this.hasPassenger(source.getEntity())) {
                return false;
            } else {
                this.setHurtDir(-this.getHurtDir());
                this.setHurtTime(10);
                this.setDamage(this.getDamage() + amount * 10.0F);
                this.markHurt();
                boolean flag = source.getEntity() instanceof Player && ((Player) source.getEntity()).getAbilities().instabuild;
                if (flag || this.getDamage() > 40.0F) {
                    if (!flag && this.level.getGameRules().getBoolean(GameRules.RULE_DOENTITYDROPS)) {
                        this.spawnAtLocation(this.getDropItem());
                    }

                    this.discard();
                }

                return true;
            }
        } else {
            return true;
        }
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        //TODO: Is this right?
        return new ClientboundAddEntityPacket(this);
    }

    public enum BYGType {
        ASPEN("aspen"),
        BAOBAB("baobab"),
        BLUE_ENCHANTED("blue_enchanted"),
        CHERRY("cherry"),
        CIKA("cika"),
        CYPRESS("cypress"),
        EBONY("ebony"),
        FIR("fir"),
        GREEN_ENCHANTED("green_enchanted"),
        HOLLY("holly"),
        JACARANDA("jacaranda"),
        MAHOGANY("mahogony"),
        MANGROVE("mangrove"),
        MAPLE("maple"),
        PALM("palm"),
        PINE("pine"),
        RAINBOW_EUCALYPTUS("rainbow_eucalyptus"),
        REDWOOD("redwood"),
        SKYRIS("skyris"),
        WILLOW("willow"),
        WITCH_HAZEL("witch_hazel"),
        ZELKOVA("zelkova");


        private final String name;

        BYGType(String string) {
            this.name = string;
        }

        /**
         * Get a boat type by it's enum ordinal
         */
        public static BYGType byId(int id) {
            BYGType[] aBYGBoatEntity$BYGType = values();
            if (id < 0 || id >= aBYGBoatEntity$BYGType.length) {
                id = 0;
            }

            return aBYGBoatEntity$BYGType[id];
        }

        public static BYGType getTypeFromString(String nameIn) {
            BYGType[] aBYGBoatEntity$BYGType = values();

            for (BYGType BYGType : aBYGBoatEntity$BYGType) {
                if (BYGType.getName().equals(nameIn)) {
                    return BYGType;
                }
            }

            return aBYGBoatEntity$BYGType[0];
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return this.name;
        }
    }
}
