package com.example.jpa_demo_todai.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.UUID;


@Setter
@Getter
@Accessors(chain=true)
@Entity
@ToString
public class User {
	
	@Id
	String id;
	
	
	String name;
	
	
	@PrePersist
	public void initId() {
		this.id = UUID.randomUUID().toString();
	}

}
