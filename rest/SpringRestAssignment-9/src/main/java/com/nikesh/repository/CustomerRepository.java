package com.nikesh.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naveen.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer,Integer>{

}
