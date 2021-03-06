package com.fms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="userid")
	private   int userid;
	@Column(name="username")
	@Size(min=4, message="Your name should have at least 4 characters.")	
	private   String username;
	@Column(name="address")
	@Size(min=5, message="At least 5 characters.")	
	private   String address;
	@Column(name="emailid")
	private   String emailid;
	@Column(name="password")
	private   String password;
	@Column(name="contactno")
	@Size(min=10, message="Invalid Mobile no")	
    @Range(min=600000000, message="Invalid mobile no")
	private   String contactno;
	@Column(name=" role")
	private String role;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username + ", address=" + address + ", emailid=" + emailid
				+ ", contactno=" + contactno + ", role=" + role + "]";
	}
	
	

	
	
}
	
	