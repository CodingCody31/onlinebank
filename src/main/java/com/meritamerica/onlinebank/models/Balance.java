package com.meritamerica.onlinebank.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "balance")
public class Balance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long balance_id;
	private Integer user_has_acct_user;
	private Integer user_has_acct_acct;
	private Double amount;
	private Date createdAt;
	private Date updatedAt;
	 @OneToMany(mappedBy="balance", fetch = FetchType.LAZY)
	    private List<Transactions> transactions;

}
