package com.github.simple_mocks.localization_service.mutable.api.dto;

import jakarta.annotation.Nonnull;

import java.util.Locale;

/**
 * Localization data key
 *
 * @param code       localization code
 * @param userLocale user locale
 * @author sibmaks
 * @since 0.0.10
 */
public record LocalizationKey(@Nonnull String code,
                              @Nonnull Locale userLocale) {
}
