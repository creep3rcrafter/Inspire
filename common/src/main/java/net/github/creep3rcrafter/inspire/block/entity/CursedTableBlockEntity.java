package net.github.creep3rcrafter.inspire.block.entity;

import net.github.creep3rcrafter.inspire.register.InspireBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CursedTableBlockEntity extends BlockEntity {
    public CursedTableBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(InspireBlockEntityTypes.CURSED_TABLE.get(), blockPos, blockState);
    }

    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }
}
