package com.laioffer.twitch.external.model;

import java.util.List;

/**
 * @author Leon Cai
 * @project twitch
 * @date 1/12/23
 */
public record ClipResponse(
        List<Clip> data
        ) {
}
