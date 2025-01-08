package com.features.service;

import com.features.exception.SellerException;
import com.features.exception.UserException;
import com.features.request.LoginRequest;
import com.features.request.SignupRequest;
import com.features.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
