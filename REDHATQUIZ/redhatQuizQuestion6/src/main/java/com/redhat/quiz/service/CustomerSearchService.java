package com.redhat.quiz.service;

import org.springframework.stereotype.Service;

import com.redhat.quiz.mapper.Customer;
import com.redhat.quiz.mapper.CustomerList;

@Service
public interface CustomerSearchService {
	
	public CustomerList searchAndSortCustomer(Customer customer,String sortBy);

}
