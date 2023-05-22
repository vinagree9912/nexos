package com.prueba.bank.repository;

import com.prueba.bank.entity.Card;
import com.prueba.bank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
