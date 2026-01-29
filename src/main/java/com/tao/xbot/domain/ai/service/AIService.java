package com.tao.xbot.domain.ai.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class AIService {
    
    public String customerService(Map<String, String> request) {
        String message = request.getOrDefault("message", "");
        return "Response to: " + message;
    }
    
    public Flux<String> streamChat(Map<String, String> request) {
        return Flux.just("Streaming response");
    }
}