package com.app;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import javax.persistence.Id;


import org.hibernate.annotations.Type;

@Embeddable
public class Compid implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	
	
	@Id
	@Column(length=10)
	@Type(type="int")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(length=15)
	@Type(type="string")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CompID [id=" + id + ", name=" + name + "]";
	}
	
}
