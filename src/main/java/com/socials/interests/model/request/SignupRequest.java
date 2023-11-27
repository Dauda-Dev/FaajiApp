package com.socials.interests.model.request;

import com.socials.interests.model.dto.Interests;
import com.socials.interests.model.dto.Socials;
import com.socials.interests.model.enums.Gender;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SignupRequest{
    private String firstName;
    private String lastName;
    private String username;
    private String dateOfBirth;
    private Gender gender;
    private String email;
    private String mobile;
    private List<Socials> socialsList;
    private List<Interests> interestsList;

}
