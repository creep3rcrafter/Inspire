package net.github.creep3rcrafter.inspire.block.entity;

import net.github.creep3rcrafter.inspire.register.InspireBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class RegularBedBlockEntity extends BlockEntity {

    public RegularBedBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(InspireBlockEntityTypes.BED.get(), blockPos, blockState);
    }

    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }
}
