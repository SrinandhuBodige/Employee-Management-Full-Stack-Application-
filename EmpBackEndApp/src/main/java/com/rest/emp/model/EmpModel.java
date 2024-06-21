package com.rest.emp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empapp")
public class EmpModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	
	@Column(name="emp_name")
	
	private String name;
	private String mobileNo;
	private String empId;
	private String empMail;
	@Override
	public String toString() {
		return "EmpModel [name=" + name + ", mobileNo=" + mobileNo + ", empId=" + empId + ", empMail=" + empMail
				+ ", getName()=" + getName() + ", getMobileNo()=" + getMobileNo() + ", getEmpId()=" + getEmpId()
				+ ", getEmpMail()=" + getEmpMail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	public EmpModel(String name, String mobileNo, String empId, String empMail) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.empId = empId;
		this.empMail = empMail;
	}
	public EmpModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
