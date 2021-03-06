/*
 * Bots: A Discord bot that manages the Templex server.
 * Copyright (C) 2018  vtcakavsmoace
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
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package co.templex.bots.lib.discord;

import de.btobastian.javacord.entities.message.embed.EmbedBuilder;

import java.awt.*;

public class Util {

    /**
     * Builds an embedded message (modified from Moudoux/DiscordSelfBot)
     *
     * @param title       Title of the embed.
     * @param description Description of the embed.
     * @param footer      Footer of the embed.
     * @param image       Image of the embed.
     * @param thumbnail   Thumbnail of the embed.
     * @param color       Color of the embed.
     * @return emb The embed builder instance generated by this function.
     */
    public static EmbedBuilder generateEmbedBuilder(final String title, final String description, final String footer,
                                                    final String image, final String thumbnail, final Color color) {
        final EmbedBuilder emb = new EmbedBuilder();
        if (title == null) {
            return null;
        }
        emb.setTitle(title);
        if (description != null)
            emb.setDescription(description);
        if (footer != null)
            emb.setFooter(footer);
        if (image != null)
            emb.setImage(image);
        if (thumbnail != null)
            emb.setThumbnail(thumbnail);
        if (color != null)
            emb.setColor(color);
        else
            emb.setColor(Color.RED);
        return emb;
    }

}
