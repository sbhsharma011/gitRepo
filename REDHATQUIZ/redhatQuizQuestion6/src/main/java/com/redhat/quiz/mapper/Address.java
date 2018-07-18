package com.redhat.quiz.mapper;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@XmlRootElement (name = "Address")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"street1", "street2", "state"})
@JsonPropertyOrder({"street1", "street2", "state"})
public class Address implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@XmlElement
	private String street1;
	@XmlElement
	private String street2;
	@XmlElement
	private String state;
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
