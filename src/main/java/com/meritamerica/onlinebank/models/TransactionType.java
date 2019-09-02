package com.meritamerica.onlinebank.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "transactions_type")
public class TransactionType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long trans_type_id;
	private String type;
	
	@OneToMany(mappedBy = "acc_types", fetch = FetchType.LAZY)
	private List<Account> accounts;

	public TransactionType(Long trans_type_id, String type, List<Account> accounts) {
		super();
		this.trans_type_id = trans_type_id;
		this.type = type;
		this.accounts = accounts;
	}

	public Long getTrans_type_id() {
		return trans_type_id;
	}

	public void setTrans_type_id(Long trans_type_id) {
		this.trans_type_id = trans_type_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	
	
	

}
