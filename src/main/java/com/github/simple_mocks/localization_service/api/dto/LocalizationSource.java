package com.github.simple_mocks.localization_service.api.dto;

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
public final class LocalizationSource {
    public static final String DEFAULT_KIND_CODE = "SERVICE_STANDARD_LOCALIZATIONS";

    private String systemCode;
    private String kindCode = DEFAULT_KIND_CODE;

    public LocalizationSource(String systemCode) {
        this.systemCode = systemCode;
    }
}
