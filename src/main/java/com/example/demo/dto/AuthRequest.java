package com.example.demo.dto;

public class AuthRequest {
    private String username;
    private String password;
    private String  email;
    private String  role;

    public AuthRequest(String username, String password, String email, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    
}
