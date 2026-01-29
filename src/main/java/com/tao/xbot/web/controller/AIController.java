package com.tao.xbot.web.controller;

import com.tao.xbot.common.util.Result;
import com.tao.xbot.domain.ai.service.AIService;
import com.tao.xbot.domain.ai.service.OCRService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/ai")
@RequiredArgsConstructor
public class AIController {
    
    private final AIService aiService;
    private final OCRService ocrService;
    
    @PostMapping("/chat")
    public Result<String> chat(@RequestBody Map<String, String> request) {
        String response = aiService.customerService(request);
        return Result.success(response);
    }
    
    @GetMapping(value = "/chat/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> streamChat(@RequestParam String message) {
        Map<String, String> request = new HashMap<>();
        request.put("message", message);
        return aiService.streamChat(request);
    }
    
    @PostMapping("/ocr/recognize")
    public Result<Map<String, Object>> recognizeImage(@RequestParam String imageUrl) {
        Map<String, Object> result = ocrService.recognizeProductLabel(imageUrl);
        return Result.success(result);
    }
}