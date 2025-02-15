package de.arnav.textembeddingbackend.controller;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface EmbeddingController
{
    public Map<String, Object> embed(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message);
}
