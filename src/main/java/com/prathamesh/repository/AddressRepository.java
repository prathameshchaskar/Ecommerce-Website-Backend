package com.prathamesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prathamesh.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
