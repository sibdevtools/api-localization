package com.github.simplemocks.localization_service.api.rs;

import com.github.simplemocks.common.api.dto.ErrorRsDto;
import com.github.simplemocks.common.api.rs.StandardBodyRs;
import com.github.simplemocks.localization_service.api.dto.LocalizedText;
import jakarta.annotation.Nullable;
import lombok.Builder;

/**
 * Localize response dto
 *
 * @author sibmaks
 * @since 0.0.1
 */
public class LocalizeRs extends StandardBodyRs<LocalizedText> {

    /**
     * Construct localize response
     *
     * @param localizedText localized text
     */
    public LocalizeRs(@Nullable LocalizedText localizedText) {
        super(localizedText);
    }

    /**
     * Construct localize response with error
     *
     * @param error happened error
     */
    public LocalizeRs(@Nullable ErrorRsDto error) {
        super(error);
    }

}
