package com.github.simplemocks.localization_service.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Localized text
 *
 * @author sibmaks
 * @since 0.0.1
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class LocalizedText implements Serializable {
    /**
     * Human-readable message
     */
    private String message;
}
