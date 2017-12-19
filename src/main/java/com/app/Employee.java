package com.app;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.type.TrueFalseType;


@Entity
@Table(name="Emp_CompID")
public class Employee {

	@EmbeddedId
	private Compid cid;
	private float sal;
	
		//to make composite primary key
	public Compid getCid() {
		return cid;
	}
	public void setCid(Compid cid) {
		this.cid = cid;
	}
	
	@Column(length=10,precision=2)
	@Type(type="float")
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Employee [cid=" + cid + ", sal=" + sal + "]";
	}
	
	
}
