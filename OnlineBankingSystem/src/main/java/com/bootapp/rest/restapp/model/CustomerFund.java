package com.bootapp.rest.restapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class CustomerFund {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@ManyToOne
private Customer customer;
@ManyToOne
private Fund fund;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public Fund getFund() {
	return fund;
}
public void setFund(Fund fund) {
	this.fund = fund;
}



}
