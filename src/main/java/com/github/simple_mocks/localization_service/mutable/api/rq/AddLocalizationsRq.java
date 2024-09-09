package com.github.simple_mocks.localization_service.mutable.api.rq;

import com.github.simple_mocks.localization_service.api.dto.LocalizationSourceId;
import com.github.simple_mocks.localization_service.api.dto.LocalizedText;
import com.github.simple_mocks.localization_service.mutable.api.dto.LocalizationKey;
import jakarta.annotation.Nonnull;

import java.util.Map;

/**
 * @author sibmaks
 * @since 0.0.10
 */
public record AddLocalizationsRq(@Nonnull LocalizationSourceId sourceId,
                                 @Nonnull Map<LocalizationKey, LocalizedText> localizations) {
}
