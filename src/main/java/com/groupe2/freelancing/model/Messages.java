package com.groupe2.freelancing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="messages")
public class Messages {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="senderId")
	private int senderId;
	
	@Column(name="receiverId")
	private int receiverId;
	
	@Column(name="messageText")
	private String messageText;
}
