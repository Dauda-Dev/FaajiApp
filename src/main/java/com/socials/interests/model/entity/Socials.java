package com.socials.interests.model.entity;

import com.socials.interests.model.enums.VIBE;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "socials",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "socialId"),
                @UniqueConstraint(columnNames = "name")
        })
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Socials extends BaseEntity{
    private String socialId;
    private String name;
    private String address;
    private List<VIBE> socialsVibe;

}
