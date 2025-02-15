package de.arnav.textembeddingbackend.service;

import java.util.Map;

public interface EmbeddingService
{
    Map<String,Object> embed(String message);
}
