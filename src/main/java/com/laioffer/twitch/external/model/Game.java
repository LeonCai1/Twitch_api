package com.laioffer.twitch.external.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Leon Cai
 * @project twitch
 * @date 1/12/23
 */
public record Game(
        String id,
        String name,
        @JsonProperty("box_art_url") String boxArtUrl
) {
}
