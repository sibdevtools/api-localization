package com.github.simplemocks.localization_service.api.rs;

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
@Builder
public class LocalizeRs extends StandardBodyRs<LocalizedText> {

    /**
     * Construct localize response
     *
     * @param localizedText localized text
     */
    public LocalizeRs(@Nullable LocalizedText localizedText) {
        super(localizedText);
    }

}
