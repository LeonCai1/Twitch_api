package com.laioffer.twitch.model;

/**
 * @author Leon Cai
 * @project twitch
 * @date 1/19/23
 */
public record TwitchErrorResponse(
        String message,
        String error,
        String details
) {
}
