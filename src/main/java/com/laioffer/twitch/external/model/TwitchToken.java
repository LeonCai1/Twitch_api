package com.laioffer.twitch.external.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Leon Cai
 * @project twitch
 * @date 1/17/23
 */
public record TwitchToken(@JsonProperty("access_token")String accessToken,
                          @JsonProperty("token_type")String tokenType,
                          @JsonProperty("expires_in")long expiresIn) {
}
