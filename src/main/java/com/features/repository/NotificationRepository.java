package com.features.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.features.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {



}
