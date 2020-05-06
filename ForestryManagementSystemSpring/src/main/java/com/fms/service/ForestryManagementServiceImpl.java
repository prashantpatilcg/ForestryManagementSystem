package com.fms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fms.dao.ForestryManagementJPAImpl;
import com.fms.dto.Contract;
import com.fms.dto.Orders;
import com.fms.dto.Product;
import com.fms.dto.Users;
@Service
public class ForestryManagementServiceImpl implements ForestryManagementService{
	
	 @Autowired
	 private ForestryManagementJPAImpl dao;
	 Users user=null;


	@Override
	public boolean createUser(Users user) {
		return dao.createUser(user);
	}


	@Override
	public boolean modifyUser(Users user) {
		return dao.modifyUser(user);
	}
	
	@Override
	public boolean updatePassword(Users user) {
		return dao.updatePassword(user);
	}


	@Override
	public Users login(String username, String password, String role) {
		return dao.login(username, password, role);
	}
	
	@Override
	public Users getPhoneno(String contactno) {
		return dao.getPhoneno(contactno);
	}


	@Override
	public boolean addProduct(Product product) {
		return dao.addProduct(product);
	}


	@Override
	public boolean deleteProduct(int productid) {
		return dao.deleteProduct(productid);
	}


	@Override
	public boolean modifyProduct(Product product) {
		
		return dao.modifyProduct(product);
	}


	@Override
	public List<Product> listProducts(Product product) {
		return dao.listProducts(product);
	}


	@Override
	public boolean addOrders(Orders order) {
		return dao.addOrders(order);
	}


	@Override
	public boolean addContract(Contract contract) {
		return dao.addContract(contract);
	}


	@Override
	public boolean deleteOrders(int orderid) {
		return dao.deleteOrders(orderid);
	}


	@Override
	public List<Contract> listContract(Contract contract) {
		return dao.listContract(contract);
	}


	@Override
	public List<Orders> listOrders(Orders order) {
		return dao.listOrders(order);
	}

}
