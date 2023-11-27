package com.socials.interests.model.dto;

import com.socials.interests.model.enums.VIBE;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Interests {
    private String interest;
    private String category;
    private VIBE vibe;
}
