package com.github.simple_mocks.localization_service.mutable.api.source;

import com.github.simple_mocks.localization_service.api.dto.LocalizationSourceId;

import java.lang.annotation.*;

/**
 * Localization source annotation
 *
 * @author sibmaks
 * @since 0.0.3
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(LocalizationJsonSources.class)
public @interface LocalizationJsonSource {

    /**
     * Localizations source system code
     *
     * @return system code
     */
    String systemCode();

    /**
     * Localization kind code
     *
     * @return kind code
     */
    String kindCode() default LocalizationSourceId.DEFAULT_KIND_CODE;

    /**
     * Locale iso3 code
     *
     * @return iso3 language code
     */
    String iso3Code();

    /**
     * Path to json file
     *
     * @return path to file
     */
    String path();
}
