package com.github.simplemocks.localization_service.mutable.api.rq;

import com.github.simplemocks.localization_service.api.dto.LocalizationSourceId;
import com.github.simplemocks.localization_service.api.dto.LocalizedText;
import com.github.simplemocks.localization_service.mutable.api.dto.LocalizationKey;
import jakarta.annotation.Nonnull;

import java.util.Map;

/**
 * Localization adding request
 *
 * @param sourceId      localization source of id
 * @param localizations localizations to add
 * @author sibmaks
 * @since 0.0.10
 */
public record AddLocalizationsRq(@Nonnull LocalizationSourceId sourceId,
                                 @Nonnull Map<LocalizationKey, LocalizedText> localizations) {
}
