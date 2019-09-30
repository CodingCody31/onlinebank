package com.meritamerica.onlinebank.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long account_id;
	private String type;
	private Integer acc_num;
	private Double amount; 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	    private User user;


	public Account() {
	}

	public Account(Long account_id, String type, Integer acc_num, Double amount, User user) {

	
		this.account_id = account_id;
		this.type = type;
		this.acc_num = acc_num;
		this.amount = amount;
		this.user = user;

	}


	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getAcc_num() {
		return acc_num;
	}

	public void setAcc_num(Integer acc_num) {
		this.acc_num = acc_num;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
