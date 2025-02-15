package de.arnav.textembeddingbackend.controller.implementation;

import de.arnav.textembeddingbackend.controller.EmbeddingController;
import de.arnav.textembeddingbackend.service.EmbeddingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EmbeddingControllerImpl implements EmbeddingController
{
    private final EmbeddingService embeddingService;

    public EmbeddingControllerImpl(EmbeddingService embeddingService)
    {
        this.embeddingService = embeddingService;
    }

    @GetMapping("/embed")
    public Map<String, Object> embed(String message)
    {
        return this.embeddingService.embed(message);
    }
}
