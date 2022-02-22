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
	
	public Services(){
		
	}
	
	public Services(long id, String category, String serviceName, String provider_id, String description,
			String requirements, String clientGet, float price, String miniaturePath, String status) {
		super();
		this.id = id;
		this.category = category;
		this.serviceName = serviceName;
		this.provider_id = provider_id;
		this.description = description;
		this.requirements = requirements;
		this.clientGet = clientGet;
		this.price = price;
		this.miniaturePath = miniaturePath;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getProvider_id() {
		return provider_id;
	}

	public void setProvider_id(String provider_id) {
		this.provider_id = provider_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public String getClientGet() {
		return clientGet;
	}

	public void setClientGet(String clientGet) {
		this.clientGet = clientGet;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getMiniaturePath() {
		return miniaturePath;
	}

	public void setMiniaturePath(String miniaturePath) {
		this.miniaturePath = miniaturePath;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

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
