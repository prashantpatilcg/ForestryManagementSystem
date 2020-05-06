package com.fms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fms.dto.Product;
import com.fms.service.ForestryManagementService;

@Controller
public class ProductMVC {
	@Autowired
	ForestryManagementService service;
	@RequestMapping(value="/productmenumvc", method=RequestMethod.GET)
	public ModelAndView getProduct(ModelAndView modelview)
	{
		modelview.setViewName("ProductMenu");
		return modelview;

}     
	@RequestMapping(value="/addproductmvc", method=RequestMethod.GET)
	public ModelAndView getApplicationUpdate(ModelAndView modelview)
	{
		modelview.setViewName("addproduct");
		return modelview;

}     
	@RequestMapping(value="/addproduct", method=RequestMethod.POST)
	public String doApplicationUpdate(HttpServletResponse resp,
			@RequestParam("productname") String productname,
			@RequestParam("productdescription") String productdescription,
			@RequestParam("price") String price,
			
			
			Product  product, ModelAndView modelview) throws ServletException, IOException {
		{
		  
		 
			product.setProductname(productname);
			product.setProductdescription(productdescription);;
			product.setPrice(Double.parseDouble(price));
		
		  boolean state=service.addProduct(product);
			
	    	if(state==true)
			{
				
	    		return "Success";
			}else
			{
				return "Fail";
			}
	}
	 
	
	
}
	@RequestMapping(value="/deleteproductmvc", method=RequestMethod.GET)
	public ModelAndView getApplicationReject(ModelAndView mv)
	{
		mv.setViewName("delete");
		return mv;

}
	
	@RequestMapping(value="/deleteProduct", method=RequestMethod.POST)
	public String doDelete(HttpServletResponse resp,HttpServletRequest req , 
			@RequestParam("productid") String productid,ModelAndView modelview) throws ServletException,IOException {
	
		
		
		
		boolean state = service.deleteProduct(Integer.parseInt(productid));
		
		
		   
		    if(state)
			{
		    	
				
		    	return "Success";
		    	
			}else
			{
				return "Fail";
			}
		
	}
	@RequestMapping(value="/productupdatemvc", method=RequestMethod.GET)
	public ModelAndView productUpdate(ModelAndView mv)
	{
		mv.setViewName("modifyproduct");
		return mv;

}        
	@RequestMapping(value="/modifyProduct", method=RequestMethod.POST)
	public String doApplicationUpdate(HttpServletResponse resp,
			@RequestParam("productid") String productid,
			@RequestParam("productname") String productname,
			@RequestParam("productdescription") String productdescription,
			@RequestParam("price") String price,
		
			Product product, ModelAndView mv) throws ServletException, IOException {
		{
		  
			product.setProductid(Integer.parseInt(productid));
			product.setProductname(productname);
			product.setProductdescription(productdescription);
			product.setPrice(Double.parseDouble(price));
		
		 
		  boolean state=service.modifyProduct(product);
			
	    	if(state==true)
			{
	    		return "Success";
				
			}else
			{
				return "Fail";
				
			}
	}
	 
	
	
}

}
