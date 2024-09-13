package com.github.simplemocks.localization_service.api.service;


import com.github.simplemocks.localization_service.api.dto.LocalizedText;
import com.github.simplemocks.localization_service.api.rq.LocalizeRq;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

/**
 * Localization service
 *
 * @author sibmaks
 * @since 0.0.1
 */
public interface LocalizationService {

    /**
     * Get localized text
     *
     * @param rq request
     * @return localized text or null
     */
    @Nullable
    LocalizedText localize(@Nonnull LocalizeRq rq);

}
