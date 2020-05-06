package com.fms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fms.dto.Orders;
import com.fms.dto.Product;
import com.fms.dto.Users;
import com.fms.service.ForestryManagementService;

@Controller
public class AddOrdersMVC {
	@Autowired
	ForestryManagementService service;
	@RequestMapping(value="/addordersmvc", method=RequestMethod.GET)
	public ModelAndView getApplicationUpdate(ModelAndView modelview)
	{
		modelview.setViewName("addorders");
		return modelview;

}        
	@RequestMapping(value="/addorders", method=RequestMethod.POST)
	public String doApplicationUpdate(HttpServletResponse resp,
			@RequestParam("productid") String productid,
			@RequestParam("customerid") String customerid,
			@RequestParam("quantity") String quantity,
			
			
			Orders  order, ModelAndView modelview) throws ServletException, IOException {
		{
			order.setProductid(Integer.parseInt(productid));
			order.setCustomerid(Integer.parseInt(customerid));
			order.setQuantity(Integer.parseInt(quantity));
			
		
		  boolean state=service.addOrders(order);
			
	    	if(state==true)
			{
				
	    		return "OrderPlaced";
			}else
			{
				return "Fail";
			}
	}
	 
	
	
}
	@RequestMapping(value="/listOfOrder", method=RequestMethod.GET)
	public void listAllProgramsOffered(HttpServletResponse resp,ModelAndView mv) throws IOException
	{
		PrintWriter printWriter=resp.getWriter();
		Orders order=new Orders();
		   List<Orders> list=service.listOrders(order);
			if(list!=null)
			{

				for(int i=0;i<list.size();i++)
				{
					order=list.get(i);


					printWriter.print("<table border=1 cellpadding='5' width='60%'");
					printWriter.print("<tr>");
					printWriter.print("<h3>"+"<th>"+"ORDER ID"+"<th>"+"<td>"+order.getOrderid()+"</td>");
					printWriter.print("<h3>"+"<th>"+"CUSTOMER ID"+"<th>"+"<td>"+order.getCustomerid()+"</td>");
					printWriter.print("<h3>"+"<th>"+"PRODUCT ID"+"<th>"+"<td>"+order.getProductid()+"</td>");
					printWriter.print("<h3>"+"<th>"+"QUANTITY"+"<th>"+"<td>"+order.getQuantity()+"</td>");
					printWriter.print("</tr>");
					printWriter.print("</table>");
				}
			}
			else
			{
				printWriter.print("<h1>"+"something went wrong"+"</h1>");
			}
}

}
