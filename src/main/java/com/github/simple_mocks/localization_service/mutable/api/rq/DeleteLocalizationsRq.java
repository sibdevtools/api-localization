package com.github.simple_mocks.localization_service.mutable.api.rq;

import com.github.simple_mocks.localization_service.api.dto.LocalizationSource;
import com.github.simple_mocks.localization_service.mutable.api.dto.LocalizationKey;
import jakarta.annotation.Nonnull;

import java.util.List;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public record DeleteLocalizationsRq(@Nonnull LocalizationSource localizationSource,
                                    @Nonnull List<LocalizationKey> localizationKeys) {
}
