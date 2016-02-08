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
package net.daboross.bukkitdev.skywars.api.storage;

import java.util.UUID;
import org.bukkit.entity.Player;

public abstract class SkyStorage {

    private static Class<? extends SkyStorageBackend> backend;

    public static Class<? extends SkyStorageBackend> getBackend() {
        return backend;
    }

    @SuppressWarnings("UnusedDeclaration")
    public static void setBackend(final Class<? extends SkyStorageBackend> backend) {
        SkyStorage.backend = backend;
    }

    public abstract void addScore(UUID uuid, int diff);

    public abstract void getScore(UUID uuid, ScoreCallback callback);

    public abstract void setScore(UUID uuid, int score);

    public abstract SkyInternalPlayer loadPlayer(Player player);

    public abstract void dataChanged();
}