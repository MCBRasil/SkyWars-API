/*
 * Copyright (C) 2013-2014 Dabo Ross <http://www.daboross.net/>
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
package net.daboross.bukkitdev.skywars.api.game;

import java.util.UUID;
import org.bukkit.entity.Player;

public interface SkyGameHandler {

    /**
     * Starts a new game with the contents of the players in the queue.
     */
    void startNewGame();

    /**
     * Ends a game with the given ID.
     *
     * @param id        the id of the game to end.
     * @param broadcast whether or not to broadcast the winner(s) of the game
     * @throws IllegalArgumentException if there is no running game with the given id.
     */
    void endGame(int id, boolean broadcast);

    /**
     * Removes a player from whatever game they are in.
     *
     * @param playerUuid the uuid of the player to remove
     * @param respawn    whether or not to call a PlayerRespawnAfterLeaveGameEvent
     * @param broadcast  whether or not to broadcast the leaving message
     * @throws IllegalArgumentException if the player is not in a game.
     */
    void removePlayerFromGame(UUID playerUuid, LeaveGameReason reason, boolean respawn, boolean broadcast);

    /**
     * Removes a player from whatever game they are in.
     *
     * @param player    the player to remove
     * @param respawn   whether or not to call a PlayerRespawnAfterLeaveGameEvent
     * @param broadcast whether or not to broadcast the leaving message
     * @throws IllegalArgumentException if the player is not in a game.
     */
    void removePlayerFromGame(Player player, LeaveGameReason reason, boolean respawn, boolean broadcast);

    /**
     * Respawns a player. This should only be called if the removePlayerFromGame method was called with respawn=false.
     *
     * @param playerUuid the uuid of the player to respawn
     */
    void respawnPlayer(UUID playerUuid);

    /**
     * Respawns a player. This should only be called if the removePlayerFromGame method was called with respawn=false.
     *
     * @param player the player to respawn
     */
    void respawnPlayer(Player player);
}
