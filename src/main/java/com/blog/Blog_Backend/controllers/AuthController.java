package com.blog.Blog_Backend.controllers;

import com.blog.Blog_Backend.payload.LoginDto;
import com.blog.Blog_Backend.payload.MeDto;
import com.blog.Blog_Backend.payload.RegisterDto;
import com.blog.Blog_Backend.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // Build login REST API
    @PostMapping(value = {"/login", "/signin"})
    public ResponseEntity<String> login(@RequestBody LoginDto loginDto) {
        String response = authService.login(loginDto);
        return ResponseEntity.ok(response);
    }

    // Build register REST API
    @PostMapping(value = {"/register", "/signup"})
    public ResponseEntity<String> register(@RequestBody RegisterDto registerDto) {
        String response = authService.register(registerDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


    // Build me REST API
    @GetMapping("/user/{id}")
    public ResponseEntity<MeDto> getUserById(@PathVariable Long id) {
        MeDto user = authService.getUserById(id);
        return ResponseEntity.ok(user);
    }
}
