package com.oblom.DiplomServer.repositories;

import com.oblom.DiplomServer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer, Integer> {
    Customer findByEmail(String email);
}
