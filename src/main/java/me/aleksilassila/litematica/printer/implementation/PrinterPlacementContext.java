package me.aleksilassila.litematica.printer.implementation;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.Direction;

import javax.annotation.Nullable;
import java.util.Objects;

public class PrinterPlacementContext extends ItemPlacementContext
{
    public final @Nullable Direction lookDirection;
    public final boolean shouldSneak;
    public final BlockHitResult hitResult;
    public final int requiredItemSlot;

    public PrinterPlacementContext(PlayerEntity player, BlockHitResult hitResult, ItemStack requiredItem,
                                   int requiredItemSlot)
    {
        this(player, hitResult, requiredItem, requiredItemSlot, null, false);
    }

    public PrinterPlacementContext(PlayerEntity player, BlockHitResult hitResult, ItemStack requiredItem,
                                   int requiredItemSlot, @Nullable Direction lookDirection, boolean requiresSneaking)
    {
        super(player, Hand.MAIN_HAND, requiredItem, hitResult);
        this.lookDirection = lookDirection;
        this.shouldSneak = requiresSneaking;
        this.hitResult = hitResult;
        this.requiredItemSlot = requiredItemSlot;
    }

    /**
     * Returns the preferred player look direction, or null if unknown.
     */
    @Nullable
    public Direction getPlayerLookDirectionSafe() {
        return lookDirection != null ? lookDirection : Objects.requireNonNull(getPlayer()).getHorizontalFacing();
    }

    /**
     * Returns the horizontal facing based on lookDirection or player facing.
     */
    public Direction getHorizontalFacing() {
        if (lookDirection != null && lookDirection.getAxis().isHorizontal()) {
            return lookDirection;
        }
        return Objects.requireNonNull(getPlayer()).getHorizontalFacing();
    }

    /**
     * Returns the vertical look direction (UP/DOWN) if the player is looking mostly vertically,
     * otherwise null. Logic adapted for 1.16.5.
     */
    @Nullable
    public Direction getVerticalLookDirection() {
        if (lookDirection != null) {
            if (lookDirection.getAxis().isVertical()) {
                return lookDirection;
            }
        } else {
            float pitch = Objects.requireNonNull(getPlayer()).pitch;
            if (pitch < -45) return Direction.UP;
            if (pitch > 45) return Direction.DOWN;
        }
        return null;
    }

    @Override
    public String toString()
    {
        return "PrinterPlacementContext{" +
                "lookDirection=" + lookDirection +
                ", requiresSneaking=" + shouldSneak +
                ", blockPos=" + hitResult.getBlockPos() +
                ", side=" + hitResult.getSide() +
                '}';
    }
}
