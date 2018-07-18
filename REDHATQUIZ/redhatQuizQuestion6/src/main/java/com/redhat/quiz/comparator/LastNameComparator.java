package com.redhat.quiz.comparator;

import java.util.Comparator;

import com.redhat.quiz.mapper.Customer;

public class LastNameComparator implements Comparator<Customer> {

	private final String sortOrder;

	LastNameComparator(String s) {
		sortOrder = s;
	}

	public int compare(Customer o1, Customer o2) {
		if ("desc".equals(sortOrder)) {
			return o1.getLastName().compareTo(o2.getLastName());
		} else {
			return o2.getLastName().compareTo(o1.getLastName());
		}
	}
}
