package com.redhat.quiz.customerEnum;

import javax.xml.bind.annotation.*;

@XmlType(name = "myEnum")
@XmlEnum
public enum CustomerSearchEnum {

	FIRSTNAME("FirstName"),
	LASTNAME("LastName"),
	STREET1("Street1"),
	STREE2("Street2"),
	STATE("State");
	
	private final String name;
	
	CustomerSearchEnum(String s){
		name=s;
	}
	
}
