package com.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
