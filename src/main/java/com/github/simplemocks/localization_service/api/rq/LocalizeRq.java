package com.github.simplemocks.localization_service.api.rq;

import com.github.simplemocks.localization_service.api.dto.LocalizationId;
import jakarta.annotation.Nonnull;

import java.util.Locale;

/**
 * Localize text request
 *
 * @param localizationId localization identity
 * @param userLocale     user locale
 * @author sibmaks
 * @since 0.0.1
 */
public record LocalizeRq(@Nonnull LocalizationId localizationId,
                         @Nonnull Locale userLocale) {
}
