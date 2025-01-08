package com.features.ai.services;

import com.features.exception.ProductException;
import com.features.response.ApiResponse;

public interface AiChatBotService {

    ApiResponse aiChatBot(String prompt,Long productId,Long userId) throws ProductException;
}
