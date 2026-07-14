package net.github.creep3rcrafter.inspire.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

@SuppressWarnings("deprecation")
public class BluestoneOreBlock extends Block {
    public static final BooleanProperty LIT;

    static {
        LIT = RedStoneOreBlock.LIT;
    }

    public BluestoneOreBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, false));
    }

    private static void light(BlockState state, Level world, BlockPos pos) {
        spawnParticles(world, pos);
        if (!state.getValue(LIT)) {
            world.setBlock(pos, state.setValue(LIT, true), 3);
        }

    }

    private static void spawnParticles(Level world, BlockPos pos) {
        double d = (double) 0.5625F;
        RandomSource random = world.random;

        for (Direction direction : Direction.values()) {
            BlockPos blockPos = pos.relative(direction);
            if (!world.getBlockState(blockPos).isSolidRender(world, blockPos)) {
                Direction.Axis axis = direction.getAxis();
                double e = axis == Direction.Axis.X ? 0.5 + d * direction.getStepX() : random.nextFloat();
                double f = axis == Direction.Axis.Y ? 0.5 + d * direction.getStepY() : random.nextFloat();
                double g = axis == Direction.Axis.Z ? 0.5 + d * direction.getStepZ() : random.nextFloat();
                world.addParticle(new DustParticleOptions(new Vector3f(0.1F, 0.1F, 1f), 1f), blockPos.getX() + e, blockPos.getY() + f, blockPos.getZ() + g, 0.0, 0.0, 0.0);
            }
        }

    }

    public void attack(BlockState state, Level world, BlockPos pos, Player player) {
        light(state, world, pos);
        super.attack(state, world, pos, player);
    }

    public void stepOn(Level world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.bypassesSteppingEffects()) {
            light(state, world, pos);
        }

        super.stepOn(world, pos, state, entity);
    }

    public @NotNull InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (world.isClientSide) {
            spawnParticles(world, pos);
        } else {
            light(state, world, pos);
        }

        ItemStack itemStack = player.getItemInHand(hand);
        return itemStack.getItem() instanceof BlockItem && (new BlockPlaceContext(player, hand, itemStack, hit)).canPlace() ? InteractionResult.PASS : InteractionResult.SUCCESS;
    }

    public boolean isRandomlyTicking(BlockState state) {
        return state.getValue(LIT);
    }

    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (state.getValue(LIT)) {
            world.setBlock(pos, state.setValue(LIT, false), 3);
        }

    }

    public void spawnAfterBreak(BlockState state, ServerLevel world, BlockPos pos, ItemStack tool, boolean dropExperience) {
        super.spawnAfterBreak(state, world, pos, tool, dropExperience);
        if (dropExperience && EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, tool) == 0) {
            int i = 1 + world.random.nextInt(5);
            this.dropExperience(world, pos, i);
        }

    }

    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        if (state.getValue(LIT)) {
            spawnParticles(world, pos);
        }

    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }
}