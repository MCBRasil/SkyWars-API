/*
 * Copyright (C) 2013 Dabo Ross <http://www.daboross.net/>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.daboross.bukkitdev.skywars.api.events;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import net.daboross.bukkitdev.skywars.api.SkyWars;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

@EqualsAndHashCode(callSuper = false)
public class PlayerLeaveQueueEvent extends PlayerEvent {

    @Getter
    private static final HandlerList handlerList = new HandlerList();
    @Getter
    private final SkyWars plugin;

    public PlayerLeaveQueueEvent(@NonNull SkyWars plugin, @NonNull Player who) {
        super(who);
        this.plugin = plugin;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
