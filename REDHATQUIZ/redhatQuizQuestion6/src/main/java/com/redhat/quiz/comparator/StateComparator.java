package com.redhat.quiz.comparator;

import java.util.Comparator;

import com.redhat.quiz.mapper.Address;

public class StateComparator implements Comparator<Address> {

	private final String sortOrder;

	StateComparator(String s) {
		sortOrder = s;
	}

	public int compare(Address o1, Address o2) {
		if ("desc".equals(sortOrder)) {
			return o1.getState().compareTo(o2.getState());
		} else {
			return o2.getState().compareTo(o1.getState());
		}
	}
}
