package com.features.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.features.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
