package com.socials.interests.api;

import com.socials.interests.model.request.LoginRequest;
import com.socials.interests.model.request.SignupRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "common/v1/consumer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@Slf4j
public class Api {


    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody@Valid SignupRequest signupRequest){

    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody@Valid LoginRequest request){

    }
}
