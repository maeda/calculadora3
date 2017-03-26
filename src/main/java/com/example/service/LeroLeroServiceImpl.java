package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class LeroLeroServiceImpl implements LeroLeroService {
    @Override
    public String generate() {
        return "{\"text\":\"bla\"}";
    }
}
