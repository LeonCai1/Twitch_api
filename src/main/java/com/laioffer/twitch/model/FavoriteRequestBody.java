package com.laioffer.twitch.model;

import com.laioffer.twitch.db.entity.ItemEntity;

/**
 * @author Leon Cai
 * @project twitch
 * @date 1/28/23
 */
public record FavoriteRequestBody(
        ItemEntity favorite
) {
}
