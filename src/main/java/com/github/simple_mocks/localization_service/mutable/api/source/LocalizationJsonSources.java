package com.github.simple_mocks.localization_service.mutable.api.source;

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
public @interface LocalizationJsonSources {

    /**
     * All localization JSON sources
     *
     * @return localization sources
     */
    LocalizationJsonSource[] value();

}
