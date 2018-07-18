package com.redhat.quiz.mapper;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.redhat.quiz.customerEnum.CustomerSearchEnum;
import com.redhat.quiz.customerEnum.SortOrder;

@Component
@XmlRootElement (name = "Customer")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"firstName", "lastName","sortBy", "sortOrder", "addresses"})
@JsonPropertyOrder({"firstName", "lastName","sortBy", "sortOrder", "addresses"})
public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;
	@XmlElement
	private String firstName;
	
	@XmlElement
	private String lastName;
	
	@XmlElement
	private CustomerSearchEnum sortBy;
	
	@XmlElement
	private SortOrder sortOrder;
	
	public SortOrder getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(SortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}

	public CustomerSearchEnum getSortBy() {
		return sortBy;
	}

	public void setSortBy(CustomerSearchEnum sortBy) {
		this.sortBy = sortBy;
	}

	@XmlElement
	private List<Address> addresses;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	
	
	
}
