package com.redhat.quiz.dao;

import com.redhat.quiz.mapper.Customer;
import com.redhat.quiz.mapper.CustomerList;

public interface CustomerSearchDao {

	CustomerList getCustomers(Customer customer);
}
