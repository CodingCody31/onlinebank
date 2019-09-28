package com.meritamerica.onlinebank.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users_accounts")
public class User_Accounts {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long user_id;
	private Long account_id;
	
	public User_Accounts(Long id, Long user_id, Long account_id) {
		this.id = id;
		this.user_id = user_id;
		this.account_id = account_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	
	
}
