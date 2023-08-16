package com.laioffer.twitch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Leon Cai
 * @project twitch
 * @date 1/29/23
 */
public record RegisterBody(
        String username,
        String password,
        @JsonProperty("first_name") String firstName,
        @JsonProperty("last_name") String lastName
) {
}
