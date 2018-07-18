package com.redhat.quiz.comparator;

import java.util.Comparator;

import com.redhat.quiz.mapper.Customer;

public class FisrtNameComparator implements Comparator<Customer> {

	private final String sortOrder;

	FisrtNameComparator(String s) {
		sortOrder = s;
	}

	public int compare(Customer o1, Customer o2) {
		if ("asec".equals(sortOrder)) {
			return o1.getFirstName().compareTo(o2.getFirstName());
		} else {
			return o2.getFirstName().compareTo(o1.getFirstName());
		}
	}

}
