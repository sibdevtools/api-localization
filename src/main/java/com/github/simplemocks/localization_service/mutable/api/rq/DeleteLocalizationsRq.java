package com.github.simplemocks.localization_service.mutable.api.rq;

import com.github.simplemocks.localization_service.api.dto.LocalizationSourceId;
import com.github.simplemocks.localization_service.mutable.api.dto.LocalizationKey;
import jakarta.annotation.Nonnull;

import java.util.List;

/**
 * Localization deleting request
 *
 * @param sourceId      localization source of id
 * @param localizations localization keys to delete
 * @author sibmaks
 * @since 0.0.1
 */
public record DeleteLocalizationsRq(@Nonnull LocalizationSourceId sourceId,
                                    @Nonnull List<LocalizationKey> localizations) {
}
