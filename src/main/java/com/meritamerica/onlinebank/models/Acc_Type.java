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
@Table(name = "acc_types")
public class Acc_Type {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long acc_type_id;
	private String type;

	@OneToMany(mappedBy = "acc_types", fetch = FetchType.LAZY)
	private List<Account> accounts;

	Acc_Type() {

	}

	public Acc_Type(String type, List<Account> accounts) {
		this.type = type;
		this.accounts = accounts;
	}

	public Long getAcc_type_id() {
		return acc_type_id;
	}

	public void setAcc_type_id(Long acc_type_id) {
		this.acc_type_id = acc_type_id;
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
