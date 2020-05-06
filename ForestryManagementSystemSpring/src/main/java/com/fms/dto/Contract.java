package com.fms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contract")
public class Contract {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="contractid")
	private   int contractid;
	@Column(name="managerid")
	private   int managerid;
	@Column(name="orderid")
	private   int orderid;
	@Column(name="deliverydate")
	private   String deliverydate;
	public int getContractid() {
		return contractid;
	}
	public void setContractid(int contractid) {
		this.contractid = contractid;
	}
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(String deliverydate) {
		this.deliverydate = deliverydate;
	}
	@Override
	public String toString() {
		return "Contract [contractid=" + contractid + ", managerid=" + managerid + ", orderid=" + orderid
				+ ", deliverydate=" + deliverydate + "]";
	}
	
	
}
	
	