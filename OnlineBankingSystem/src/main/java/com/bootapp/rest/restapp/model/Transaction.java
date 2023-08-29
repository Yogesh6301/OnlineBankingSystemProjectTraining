package com.bootapp.rest.restapp.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long fromaccountid;
	private Long toaccountid;
	private double amount;
	private Date date;

	public Transaction() {
	}

	public Transaction(Long fromaccountid, Long toaccountid, double amount, Date date) {

		this.fromaccountid = fromaccountid;
		this.toaccountid = toaccountid;
		this.amount = amount;
		this.date = date;
	}

	public Long getFromaccountid() {
		return fromaccountid;
	}

	public void setFromaccountid(Long fromaccountid) {
		this.fromaccountid = fromaccountid;
	}

	public Long getToaccountid() {
		return toaccountid;
	}

	public void setToaccountid(Long toaccountid) {
		this.toaccountid = toaccountid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}