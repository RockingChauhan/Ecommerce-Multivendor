package com.features.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.features.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
