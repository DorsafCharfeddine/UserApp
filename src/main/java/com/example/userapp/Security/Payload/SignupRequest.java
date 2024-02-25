package com.example.userapp.Security.Payload;

import com.example.userapp.Entity.Role;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class SignupRequest {
    private String username;
    private String email;
    private String password;
    private Set<String> role;
    // Getters and setters

}

