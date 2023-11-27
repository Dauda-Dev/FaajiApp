package com.socials.interests.dao;

import com.socials.interests.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Jpa21Utils;

import java.util.Optional;

public interface UserRespository extends JpaRepository<Users, Long> {
    Optional<Users> findByMobileOrEmail(String mobile, String email);



}
