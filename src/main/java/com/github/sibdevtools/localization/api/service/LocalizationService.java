package com.github.sibdevtools.localization.api.service;


import com.github.sibdevtools.localization.api.rq.LocalizeRq;
import com.github.sibdevtools.localization.api.rs.LocalizeRs;
import jakarta.annotation.Nonnull;

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
    @Nonnull
    LocalizeRs localize(@Nonnull LocalizeRq rq);

}
