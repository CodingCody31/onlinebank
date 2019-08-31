package com.meritamerica.onlinebank.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "acc_type_id")
	private Acc_Type acc_types;

	Account() {
	}

	public Account(String type, Integer acc_num, Acc_Type acc_types) {

		this.type = type;
		this.acc_num = acc_num;
		this.acc_types = acc_types;
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

	public Acc_Type getAcc_types() {
		return acc_types;
	}

	public void setAcc_types(Acc_Type acc_types) {
		this.acc_types = acc_types;
	}

}
