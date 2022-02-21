package com.groupe2.freelancing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="services")
public class Services {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="category")
	private String category;
	
	@Column(name="seviceName")
	private String serviceName;
	
	@Column(name="provider_id")
	private String provider_id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="requirements")
	private String requirements;
	
	@Column(name="clientGet")
	private String clientGet;
	
	@Column(name="price")
	private float price;
	
	@Column(name="miniaturePath")
	private String miniaturePath;
	
	@Column(name="status")
	private String status;
}
