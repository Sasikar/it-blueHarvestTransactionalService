package com.blueharvest.dto;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Transaction")

public class Transaction implements Serializable {

	@Id
	@SequenceGenerator(initialValue = 785691, allocationSize = 1, name = "currentAccount_sequence", sequenceName = "currentAccount_sequence")
	@GeneratedValue(generator = "currentAccount_sequence")
	@Column(name = "currentAccount", nullable = false)
	private Long currentAccount;

	@Column(name = "customerID", length = 64, nullable = false)
	private long custID;

	
	private long transactionID;
	
	private long initialCredit;

	public Long getCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(Long currentAccount) {
		this.currentAccount = currentAccount;
	}

	public long getCustID() {
		return custID;
	}

	public void setCustID(long custID) {
		this.custID = custID;
	}

	public long getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(long transactionID) {
		this.transactionID = transactionID;
	}

	public long getInitialCredit() {
		return initialCredit;
	}

	public void setInitialCredit(long initialCredit) {
		this.initialCredit = initialCredit;
	}

	@Override
	public String toString() {
		return "Transaction [currentAccount=" + currentAccount + ", custID=" + custID + ", transactionID="
				+ transactionID + ", initialCredit=" + initialCredit + "]";
	}

	
	
	
	
	

}
