package com.github.simplemocks.localization_service.mutable.api.service;

import com.github.simplemocks.localization_service.mutable.api.rq.AddLocalizationsRq;
import com.github.simplemocks.localization_service.mutable.api.rq.DeleteLocalizationsRq;
import jakarta.annotation.Nonnull;

/**
 * Interface provide ability to change localization service state
 *
 * @author sibmaks
 * @since 0.0.10
 */
public interface MutableLocalizationService {

    /**
     * Add localizations.
     * In case if localizations already exist, then do nothing
     *
     * @param rq add request
     */
    void addLocalizations(@Nonnull AddLocalizationsRq rq);

    /**
     * Delete localizations.
     * In case if localizations are already deleted, then do nothing
     *
     * @param rq deleting request
     */
    void deleteLocalizations(@Nonnull DeleteLocalizationsRq rq);
}
