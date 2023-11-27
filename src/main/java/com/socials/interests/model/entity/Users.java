package com.socials.interests.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name ="users",
uniqueConstraints = {
        @UniqueConstraint(columnNames = "mobile"),
        @UniqueConstraint(columnNames = "email")
})
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users extends BaseEntity {
    private String userId;
    private String firstName;
    private String lastName;
    private String username;
    private String dateOfBirth;
    private String gender;
    private String email;
    private String mobile;
    @ManyToMany(fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Socials> socials;
}
