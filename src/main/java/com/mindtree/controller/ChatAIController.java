package com.mindtree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.service.ChatAIService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/ai")
public class ChatAIController {
	
	@Autowired
	private ChatAIService aiService;
	
	@GetMapping("/prompt")
    public String askAI(@RequestParam(value="question") String question) {
        // Assuming askToDeepseekAI is a synchronous method returning a String
        return aiService.askToDeepSeekAI(question);
    }
	
	@GetMapping("/prompt/stream")
	public Flux<String> askChunksAI(@RequestParam(value="question") String question) {
		return aiService.askToDeepseekAIWithStream(question);
	}
	
	

}
