package com.github.simple_mocks.localization_service.mutable.api.dto;

import jakarta.annotation.Nonnull;

import java.util.Locale;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public record LocalizationKey(@Nonnull String code,
                              @Nonnull Locale userLocale) {
}
