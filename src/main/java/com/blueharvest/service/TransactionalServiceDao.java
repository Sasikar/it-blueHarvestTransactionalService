package com.blueharvest.service;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueharvest.dto.Transaction;
 

@Repository

public interface TransactionalServiceDao extends JpaRepository<Transaction, Long> {
 
    public List<Transaction> findBycustIDLike(long custID);
 
    
 
}