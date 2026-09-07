package io.github.sibdevtools.localization.mutable.api.rq;

import io.github.sibdevtools.localization.mutable.api.dto.LocalizationKey;
import io.github.sibdevtools.localization.api.dto.LocalizationSourceId;
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
