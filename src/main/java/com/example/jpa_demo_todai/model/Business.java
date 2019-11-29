package com.example.jpa_demo_todai.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


@Setter
@Getter
@Accessors(chain=true)
@Entity
@ToString
public class Business {
	
	@Id
	String id;
	
	
	String name;
	
	
	@OneToMany(mappedBy="employer")
	Set<User> employees = new HashSet<>();
	
	public void printUsers() {
		for(User u : employees) {
			System.out.println(u.getName());
		}
	}
	
	@PrePersist
	public void initId() {
		this.id = UUID.randomUUID().toString();
	}

}
