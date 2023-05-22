package com.prueba.bank.repository;

import com.prueba.bank.entity.Card;
import com.prueba.bank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
