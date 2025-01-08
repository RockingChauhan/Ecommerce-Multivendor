package com.features.controller;

import com.features.response.ApiResponse;
import com.features.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping
    public ResponseEntity<ApiResponse> home(){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Ecommerce multi vendor system");
        return new ResponseEntity<>(apiResponse, HttpStatus.ACCEPTED);
    }




}
