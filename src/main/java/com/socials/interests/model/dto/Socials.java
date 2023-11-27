package com.socials.interests.model.dto;

import com.socials.interests.model.enums.VIBE;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Socials {
    private String name;
    private String address;
    private List<VIBE> socialsVibe;
}
