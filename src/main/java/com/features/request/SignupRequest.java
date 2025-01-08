package com.features.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignupRequest {
    private String fullName;
    private String email;
    private String otp;
}
