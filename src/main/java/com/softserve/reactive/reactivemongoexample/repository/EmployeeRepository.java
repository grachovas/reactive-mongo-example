package com.softserve.reactive.reactivemongoexample.repository;

import com.softserve.reactive.reactivemongoexample.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {

}
