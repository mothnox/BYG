package potionstudios.byg.common.world.feature.gen.nether.trees.withering;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import potionstudios.byg.common.block.BYGBlocks;
import potionstudios.byg.common.block.end.impariusgrove.TreeBranchBlock;
import potionstudios.byg.common.world.feature.config.BYGMushroomConfig;
import potionstudios.byg.common.world.feature.gen.overworld.mushrooms.util.BYGAbstractMushroomFeature;

import java.util.Random;

public class WitheringOakTree5 extends BYGAbstractMushroomFeature<BYGMushroomConfig> {

    public WitheringOakTree5(Codec<BYGMushroomConfig> configIn) {
        super(configIn);
    }

    protected boolean placeMushroom(WorldGenLevel worldIn, Random rand, BlockPos pos, boolean isMushroom, BYGMushroomConfig config) {
        BlockState STEM = config.getStemProvider().getState(rand, pos);
        BlockState MUSHROOM = config.getMushroomProvider().getState(rand, pos);
        BlockState MUSHROOM2 = config.getMushroom2Provider().getState(rand, pos);
        BlockState MUSHROOM3 = config.getMushroom3Provider().getState(rand, pos);
        BlockState POLLEN = config.getPollenProvider().getState(rand, pos);
        int randTreeHeight = 14 + rand.nextInt(5);
        BlockPos.MutableBlockPos mainmutable = new BlockPos.MutableBlockPos().set(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getMaxBuildHeight()) {
            if (!isDesiredGroundwDirtTag(config, worldIn, pos.below(), BYGBlocks.OVERGROWN_NETHERRACK.get())) {
                return false;
            } else if (!this.isAnotherMushroomLikeThisNearby(worldIn, pos, randTreeHeight, 0, STEM.getBlock(), MUSHROOM.getBlock(), isMushroom)) {
                return false;
            } else if (!this.doesMushroomHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, 5, isMushroom)) {
                return false;
            } else {
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 0, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 1, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 2, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 3, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 4, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 5, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 6, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 7, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 8, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 9, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 10, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 11, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 12, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 13, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 14, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 15, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 16, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 17, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 18, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 0, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 0, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 0, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 0, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 0, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 0, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 0, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 0, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 0, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 0, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 0, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 0, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 1, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 1, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 1, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 1, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 1, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 1, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 1, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 1, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 1, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 2, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 2, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 2, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 2, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 2, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 2, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 3, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 3, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 3, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 3, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 4, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 4, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 4, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 4, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 4, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 5, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 5, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 5, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 5, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 5, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 5, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 5, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(3, 5, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 6, -3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 6, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 6, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 6, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 6, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 6, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 6, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 6, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 6, 3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(3, 6, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-3, 7, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 7, -3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 7, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 7, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 7, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 7, 3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(3, 7, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-3, 8, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 8, -3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 8, 3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-3, 9, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 10, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 11, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 11, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 12, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 13, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 14, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 15, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 16, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 16, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 4, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 5, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 6, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 6, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 6, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 7, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 7, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 7, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 7, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 7, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 7, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 7, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 8, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 8, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 8, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 8, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 9, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 9, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 9, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 9, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 9, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 9, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 9, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 10, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 10, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 10, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 10, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 10, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 10, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 10, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 10, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 10, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 11, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 11, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 11, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 11, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 11, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 11, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 11, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 11, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 11, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 12, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 12, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 12, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 13, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 13, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 13, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 13, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 13, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 13, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 13, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 13, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 13, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 13, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 14, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 14, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 14, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 14, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 14, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 14, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 14, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 14, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 14, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 14, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 15, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 15, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 15, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 15, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 15, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 15, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 15, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 15, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 15, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 15, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 16, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 16, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 16, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 16, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 16, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 16, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 16, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 16, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 16, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 16, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 16, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 16, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 17, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 17, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 17, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 17, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 17, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 17, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 17, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 17, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 18, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 18, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 18, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 18, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 18, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 19, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 19, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 19, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 19, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 20, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 20, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 20, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 21, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 22, 0));
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(-2, 2, -1), Direction.WEST);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(0, 2, -2), Direction.NORTH);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(2, 2, 0), Direction.EAST);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(-1, 3, -1), Direction.WEST);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(-1, 3, 1), Direction.WEST);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(1, 3, -1), Direction.NORTH);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(1, 3, 1), Direction.SOUTH);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(-2, 4, 0), Direction.WEST);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(0, 4, -2), Direction.NORTH);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(0, 4, 2), Direction.SOUTH);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(2, 4, 0), Direction.EAST);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(-1, 5, -1), Direction.WEST);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(-1, 5, 1), Direction.SOUTH);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(0, 5, 2), Direction.WEST);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(2, 5, -2), Direction.NORTH);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(2, 5, 2), Direction.EAST);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(-2, 6, 0), Direction.NORTH);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(-2, 6, 2), Direction.SOUTH);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(0, 6, -2), Direction.EAST);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(1, 6, -1), Direction.NORTH);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(1, 6, 4), Direction.SOUTH);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(2, 6, 0), Direction.EAST);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(-4, 7, 2), Direction.WEST);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(-1, 7, 0), Direction.WEST);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(0, 7, 2), Direction.SOUTH);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(1, 7, -1), Direction.EAST);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(1, 7, 1), Direction.EAST);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(0, 8, 1), Direction.SOUTH);
                this.ArisianBloomBranch(worldIn, mainmutable.set(pos).move(-1, 9, 0), Direction.WEST);
            }
        }
        return true;
    }
    private void ArisianBloomBranch(WorldGenLevel reader, BlockPos pos, Direction direction) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(reader, pos, BYGBlocks.ARISIAN_BLOOM_BRANCH.defaultBlockState().setValue(TreeBranchBlock.FACING, direction));
        }
    }
}