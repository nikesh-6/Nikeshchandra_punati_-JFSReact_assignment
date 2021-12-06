package com.rest.repositiory;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.rest.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

	
}
