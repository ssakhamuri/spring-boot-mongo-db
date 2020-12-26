package com.javadev.springbootmongodb.repository;

import com.javadev.springbootmongodb.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {
    public Account findByName(String name);
}
