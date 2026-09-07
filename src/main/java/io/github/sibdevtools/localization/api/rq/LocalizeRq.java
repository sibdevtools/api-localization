package io.github.sibdevtools.localization.api.rq;

import io.github.sibdevtools.localization.api.dto.LocalizationId;
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
