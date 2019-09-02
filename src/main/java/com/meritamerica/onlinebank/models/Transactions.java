package com.meritamerica.onlinebank.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transactions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transaction_id;
	private Double amount;
    @Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="account_id")
    private Account account;
	Transactions() {
		
	}
	public Transactions(Double amount, Date createdAt, Date updatedAt, Account account) {
		
		this.amount = amount;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.account = account;
	}
	public Long getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(Long transaction_id) {
		this.transaction_id = transaction_id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Account getAccount() {
		return account;
	}
	public void setBalance(Account account) {
		this.account = account;
	}

}


