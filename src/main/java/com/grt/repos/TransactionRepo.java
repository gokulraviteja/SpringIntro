package com.grt.repos;

import com.grt.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TransactionRepo  extends JpaRepository<Transaction,Integer> {

}
