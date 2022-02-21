package com.groupe2.freelancing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="commands")
public class Commands {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="providerId")
	private int providerId;
	
	@Column(name="clientId")
	private int clientId;
	
	@Column(name="serviceId")
	private int serviceId;
	
	@Column(name="commandStatus")
	private String commandStatus;
}
