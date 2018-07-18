package com.redhat.quiz.customerEnum;

public enum SortOrder {
	
	ASEC("Asec"),
	DESC("Desc");
	
	private final String value;
	
	SortOrder(String s){
		value=s;
	}

}
