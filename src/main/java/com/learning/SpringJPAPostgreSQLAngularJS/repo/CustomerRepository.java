package com.learning.SpringJPAPostgreSQLAngularJS.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.learning.SpringJPAPostgreSQLAngularJS.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	List<Customer> findByLastName(String lastName);
	
}
