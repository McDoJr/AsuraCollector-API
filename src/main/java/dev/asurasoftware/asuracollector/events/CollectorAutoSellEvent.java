package dev.asurasoftware.asuracollector.events;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class CollectorAutoSellEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled = false;
    @Getter
    private final ItemStack itemStack;
    @Getter
    @Setter
    private double sellPrice;
    @Getter
    private final OfflinePlayer offlinePlayer;

    public CollectorAutoSellEvent(ItemStack itemStack, double sellPrice, OfflinePlayer offlinePlayer) {
        this.itemStack = itemStack;
        this.sellPrice = sellPrice;
        this.offlinePlayer = offlinePlayer;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }
}
