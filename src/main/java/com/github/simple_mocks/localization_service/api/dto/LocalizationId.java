package com.github.simple_mocks.localization_service.api.dto;

import jakarta.annotation.Nonnull;

/**
 * Localization identity
 *
 * @param sourceId localization source identity
 * @param code     localization code
 * @author sibmaks
 * @since 0.0.2
 */
public record LocalizationId(
        @Nonnull LocalizationSourceId sourceId,
        @Nonnull String code
) {
}
