package com.github.simple_mocks.localization_service.api.rq;

import com.github.simple_mocks.localization_service.api.dto.LocalizationSource;
import jakarta.annotation.Nonnull;

import java.util.Locale;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public record LocalizeRq(@Nonnull LocalizationSource localizationSource,
                         @Nonnull String localizationCode,
                         @Nonnull Locale userLocale) {
}
