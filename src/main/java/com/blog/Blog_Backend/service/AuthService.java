package com.blog.Blog_Backend.service;

import com.blog.Blog_Backend.payload.LoginDto;
import com.blog.Blog_Backend.payload.MeDto;
import com.blog.Blog_Backend.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    MeDto getUserById(Long id);
}
