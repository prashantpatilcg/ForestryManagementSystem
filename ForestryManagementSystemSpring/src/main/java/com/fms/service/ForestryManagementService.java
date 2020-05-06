package com.fms.service;

import java.util.List;

import com.fms.dto.Contract;
import com.fms.dto.Orders;
import com.fms.dto.Product;
import com.fms.dto.Users;

public interface ForestryManagementService {
	
	public boolean createUser(Users user);
	public boolean modifyUser(Users user);
	public boolean updatePassword(Users user);
	public Users login(String username, String password,String role);
	public Users getPhoneno(String contactno);
	
	public boolean addOrders(Orders order);
    public boolean deleteOrders(int orderid);
	public  List<Orders> listOrders(Orders order);


	
	public boolean addProduct(Product product);
	public boolean deleteProduct(int productid);
	public boolean modifyProduct(Product product);
	public List<Product> listProducts(Product product);

    public boolean addContract(Contract contract);
	public  List<Contract> listContract(Contract contract);


	


}
