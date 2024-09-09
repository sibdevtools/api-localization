package com.github.simple_mocks.localization_service.api.service;


import com.github.simple_mocks.localization_service.api.dto.LocalizedText;
import com.github.simple_mocks.localization_service.api.dto.LocalizationSource;
import com.github.simple_mocks.localization_service.api.rq.LocalizeRq;
import jakarta.annotation.Nonnull;

import java.util.Locale;

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
    LocalizedText localize(@Nonnull LocalizeRq rq);

}
