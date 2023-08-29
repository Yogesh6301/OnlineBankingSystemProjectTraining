package com.bootapp.rest.restapp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bootapp.rest.restapp.enums.LoanEnum;

@Entity
@Table(name="loans")
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int loan_Id;
	
	@Column(name="loan_borrower")
	private String borrower;
	
	@Column(name="loan_type")
	private String type;
	
	@Column(name="loan_amount")
	private double amount;
	
	@Column(name="loan_date")
	private LocalDate startDate;
	
	
	@Enumerated(EnumType.STRING)
	private LoanEnum loanenum;
	
	
	@OneToMany
	private Customer customer;


	public int getLoan_Id() {
		return loan_Id;
	}


	public void setLoan_Id(int loan_Id) {
		this.loan_Id = loan_Id;
	}


	public String getBorrower() {
		return borrower;
	}


	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public LoanEnum getLoanenum() {
		return loanenum;
	}


	public void setLoanenum(LoanEnum loanenum) {
		this.loanenum = loanenum;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
