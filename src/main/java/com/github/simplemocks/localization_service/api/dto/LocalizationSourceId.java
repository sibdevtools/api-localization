package com.github.simplemocks.localization_service.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Service localization type
 *
 * @author sibmaks
 * @since 0.0.1
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class LocalizationSourceId {
    /**
     * Default kind code
     */
    public static final String DEFAULT_KIND_CODE = "SERVICE_STANDARD_LOCALIZATIONS";

    /**
     * System code
     */
    private String systemCode;
    /**
     * Kind code, can be used to clarify localization source
     */
    private String kindCode = DEFAULT_KIND_CODE;

    /**
     * Construct localization source code from system
     *
     * @param systemCode system code
     */
    public LocalizationSourceId(String systemCode) {
        this.systemCode = systemCode;
    }
}
