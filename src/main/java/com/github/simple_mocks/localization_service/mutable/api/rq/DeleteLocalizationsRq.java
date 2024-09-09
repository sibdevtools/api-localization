package com.github.simple_mocks.localization_service.mutable.api.rq;

import com.github.simple_mocks.localization_service.api.dto.LocalizationSourceId;
import com.github.simple_mocks.localization_service.mutable.api.dto.LocalizationKey;
import jakarta.annotation.Nonnull;

import java.util.List;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public record DeleteLocalizationsRq(@Nonnull LocalizationSourceId sourceId,
                                    @Nonnull List<LocalizationKey> localizations) {
}
