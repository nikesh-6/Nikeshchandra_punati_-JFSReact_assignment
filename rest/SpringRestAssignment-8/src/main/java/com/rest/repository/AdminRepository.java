package com.rest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rest.model.Admin;


public interface AdminRepository extends MongoRepository<Admin,Integer> {

}
