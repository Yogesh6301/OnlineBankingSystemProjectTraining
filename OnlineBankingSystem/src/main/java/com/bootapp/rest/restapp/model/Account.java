package com.bootapp.rest.restapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.bootapp.rest.restapp.enums.AccountType;

//import javax.persistence.OneToMany; import com.bootapp.rest.restapp.enums.AccountType; @Entity
public class Account {
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;
	@Column(name = "acc_balance")
	private double accountBalance;
	@Enumerated(EnumType.STRING)
	private AccountType accountype;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public AccountType getAccountype() {
		return accountype;
	}
	public void setAccountype(AccountType accountype) {
		this.accountype = accountype;
	}
	
//@OneToMany
//     private Customer customer;
	
}