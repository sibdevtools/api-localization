package com.github.simple_mocks.localization_service.mutable.api.rq;

import com.github.simple_mocks.localization_service.api.dto.LocalizedText;
import com.github.simple_mocks.localization_service.api.dto.LocalizationSource;
import com.github.simple_mocks.localization_service.mutable.api.dto.LocalizationKey;
import jakarta.annotation.Nonnull;

import java.util.List;
import java.util.Map;

/**
 * @author sibmaks
 * @since 0.0.10
 */
public record AddLocalizationsRq(@Nonnull LocalizationSource localizationSource,
                                 @Nonnull Map<LocalizationKey, List<LocalizedText>> localizations) {
}
