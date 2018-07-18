package com.redhat.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.redhat.quiz.mapper.Customer;
import com.redhat.quiz.mapper.CustomerList;
import com.redhat.quiz.service.CustomerSearchService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	CustomerSearchService customerSearchService;

	@RequestMapping(value = "/getCustomer", method = RequestMethod.POST,produces={"application/json","application/xml"},
	        consumes={"application/json", "application/xml"})
	public CustomerList searchCustomer(Customer customer){
		customerSearchService.searchAndSortCustomer(customer, customer.getSortBy().name());
		return null;
	}
	
}
