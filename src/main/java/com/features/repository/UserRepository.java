package com.features.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.features.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	public User findByEmail(String username);

}
