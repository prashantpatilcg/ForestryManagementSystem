package com.fms.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.fms.dto.Contract;
import com.fms.dto.Orders;
import com.fms.dto.Product;
import com.fms.dto.Users;
@Repository
public class ForestryManagementJPAImpl implements ForestryManagementDAO{
	@PersistenceUnit  
	EntityManagerFactory emf;// = Persistence.createEntityManagerFactory("myPersistenceUnit");


	public boolean createUser(Users user) {

		boolean state=false;
		EntityManager emanager=null;
		emanager = emf.createEntityManager();
		try {
			emanager.getTransaction().begin();


			emanager.persist(user);

			state=true;
			

		} catch(Exception e) {
			e.printStackTrace();

		}finally {
			if(emanager!= null) {
				emanager.getTransaction().commit();
				emanager.close();
			}
		}	
		return state;
	}


	

	@Override
	public boolean modifyUser(Users user) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			String jqpl="update Users u set u.username=:username, u.address=:address, u.contactno=:contactno, u.emailid=:emailid, u.password=:password, u.role=:role where u.userid=:userid";
			Query query = em.createQuery(jqpl); 
			query.setParameter("username",user.getUsername());
			query.setParameter("address",user.getAddress());
			query.setParameter("contactno",user.getContactno());
			query.setParameter("emailid",user.getEmailid());
			query.setParameter("password",user.getPassword());
			query.setParameter("role",user.getRole());
			query.setParameter("userid",user.getUserid());
			int count=query.executeUpdate();

			em.getTransaction().commit();
			if(count>0) {
				state = true;
			}
		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			if(em!= null) {
				em.close();
			}}

		return state;

	}

	@Override
	public boolean updatePassword(Users user) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			String jqpl="update Users u set u.password=:password where u.contactno=:contactno";
			Query query = em.createQuery(jqpl); 
			query.setParameter("contactno",user.getContactno());
			query.setParameter("password",user.getPassword());
			int count=query.executeUpdate();

			em.getTransaction().commit();
			if(count>0) {
				state = true;
			}
		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			if(em!= null) {
				em.close();
			}}

		return state;

	}
	
	@Override
	public Users login(String username, String password,String role) {



		Users userr=null;
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			String jqpl="select u from Users u where u.username=:username and u.password=:password and u.role=:role";
			Query query = em.createQuery(jqpl); 
			query.setParameter("username", username);
			query.setParameter("password", password);
			query.setParameter("role", role);


			userr=(Users) query.getSingleResult();

			em.getTransaction().commit();
			return userr;

		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			if(em!= null) {
				em.close();
			}
		}

		return userr;
	}

	@Override
	public Users getPhoneno(String contactno) {



		Users userr=null;
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			String jqpl="select u from Users u where u.contactno=:contactno ";
			Query query = em.createQuery(jqpl); 
			query.setParameter("contactno", contactno);

			userr=(Users) query.getSingleResult();

			em.getTransaction().commit();
			return userr;

		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			if(em!= null) {
				em.close();
			}
		}

		return userr;
	}


	public boolean addProduct(Product product) {

		boolean state=false;
		EntityManager emanager=null;
		emanager = emf.createEntityManager();
		try {
			emanager.getTransaction().begin();


			emanager.persist(product);

			state=true;
			

		} catch(Exception e) {
			e.printStackTrace();

		}finally {
			if(emanager!= null) {
				emanager.getTransaction().commit();
				emanager.close();
			}
		}	
		return state;
	}




	@Override
	public boolean deleteProduct(int productid)
	{
		boolean state=false;
		EntityManager em = emf.createEntityManager();

		try{
			em.getTransaction().begin();

			String query="delete from Product  where productid=:productid";
			Query qu=em.createQuery(query);
			qu.setParameter("productid", productid);
			int count=qu.executeUpdate();

			if(count>0)
			{
				state=true;

			}


		
		}
		catch(Exception e)
		{
			e.printStackTrace();

		}finally{
			if(em!=null){
				em.getTransaction().commit();
				em.close();
			}
		}
		return state;
	}




	@Override
	public boolean modifyProduct(Product product) {
		boolean state=false;
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			String jqpl="update Product p set p.productname=:productname, p.price=:price, p.productdescription=:productdescription where p.productid=:productid";
			Query query = em.createQuery(jqpl); 
			query.setParameter("productname",product.getProductname());
			query.setParameter("price",product.getPrice());
			query.setParameter("productdescription",product.getProductdescription());
			query.setParameter("productid",product.getProductid());
			
			int count=query.executeUpdate();

			em.getTransaction().commit();
			if(count>0) {
				state = true;
			}
		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			if(em!= null) {
				em.close();
			}}

		return state;

	}




	@Override
	public List<Product> listProducts(Product product) {
		EntityManager em = emf.createEntityManager();
		List<Product> list = new ArrayList<Product>();
		try {
			em.getTransaction().begin();
			String jqpl= "select p from Product p ";
			TypedQuery<Product> query = em.createQuery(jqpl,Product.class); 

			list=query.getResultList();



		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			if(em!= null) {
				em.getTransaction().commit();
				em.close();
			}}
		return list;

	}

	public boolean addOrders(Orders order) {

		boolean state=false;
		EntityManager emanager=null;
		emanager = emf.createEntityManager();
		try {
			emanager.getTransaction().begin();


			emanager.persist(order);

			state=true;
			

		} catch(Exception e) {
			e.printStackTrace();

		}finally {
			if(emanager!= null) {
				emanager.getTransaction().commit();
				emanager.close();
			}
		}	
		return state;
	}



	public boolean addContract(Contract contract) {

		boolean state=false;
		EntityManager emanager=null;
		emanager = emf.createEntityManager();
		try {
			emanager.getTransaction().begin();


			emanager.persist(contract);

			state=true;
			

		} catch(Exception e) {
			e.printStackTrace();

		}finally {
			if(emanager!= null) {
				emanager.getTransaction().commit();
				emanager.close();
			}
		}	
		return state;
	}




	@Override
	public boolean deleteOrders(int orderid)
	{
		boolean state=false;
		EntityManager em = emf.createEntityManager();

		try{
			em.getTransaction().begin();

			String query="delete from Orders  where orderid=:orderid";
			Query qu=em.createQuery(query);
			qu.setParameter("orderid", orderid);
			int count=qu.executeUpdate();

			if(count>0)
			{
				state=true;

			}


		
		}
		catch(Exception e)
		{
			e.printStackTrace();

		}finally{
			if(em!=null){
				em.getTransaction().commit();
				em.close();
			}
		}
		return state;
	}



	@Override
	public List<Contract> listContract(Contract contract) {
		EntityManager em = emf.createEntityManager();
		List<Contract> list = new ArrayList<Contract>();
		try {
			em.getTransaction().begin();
			String jqpl= "select c from Contract c ";
			TypedQuery<Contract> query = em.createQuery(jqpl,Contract.class); 

			list=query.getResultList();



		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			if(em!= null) {
				em.getTransaction().commit();
				em.close();
			}}
		return list;

	}




	@Override
	public List<Orders> listOrders(Orders order) {
		EntityManager em = emf.createEntityManager();
		List<Orders> list = new ArrayList<Orders>();
		try {
			em.getTransaction().begin();
			String jqpl= "select o from Orders o ";
			TypedQuery<Orders> query = em.createQuery(jqpl,Orders.class); 

			list=query.getResultList();



		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			if(em!= null) {
				em.getTransaction().commit();
				em.close();
			}}
		return list;

	}


	
}
