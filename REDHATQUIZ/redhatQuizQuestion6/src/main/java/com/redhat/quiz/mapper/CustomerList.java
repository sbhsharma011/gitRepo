package com.redhat.quiz.mapper;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "customerList")
@XmlAccessorType(XmlAccessType.NONE)
public class CustomerList implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private List<Customer> customerList;

	public List<Customer> getCustomerList() {
		return customerList;
	}

	@XmlElement(name="Customer")
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

}
