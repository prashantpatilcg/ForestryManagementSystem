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

import com.fms.dto.Contract;
import com.fms.dto.Product;
import com.fms.service.ForestryManagementService;

@Controller
public class AddContractMVC {
	@Autowired
	ForestryManagementService service;
	@RequestMapping(value="/addContractmvc", method=RequestMethod.GET)
	public ModelAndView getApplicationUpdate(ModelAndView modelview)
	{
		modelview.setViewName("addcontract");
		return modelview;

}        
	@RequestMapping(value="/addContract", method=RequestMethod.POST)
	public String doApplicationUpdate(HttpServletResponse resp,
			@RequestParam("managerid") String managerid,
			@RequestParam("orderid") String orderid,
			@RequestParam("deliverydate") String deliverydate,
			
			
			Contract  contract, ModelAndView modelview) throws ServletException, IOException {
		{
		  
		 contract.setManagerid(Integer.parseInt(managerid));
		 contract.setOrderid(Integer.parseInt(orderid));
		 contract.setDeliverydate(deliverydate);
		
		  boolean state=service.addContract(contract);
			
	    	if(state==true)
			{
				
	    		return "Success";
			}else
			{
				return "Fail";
			}
	}
	 
	
	
}
	
	@RequestMapping(value="/listOfContract", method=RequestMethod.GET)
	public void listContracts(HttpServletResponse resp,ModelAndView mv) throws IOException
	{
		PrintWriter printWriter=resp.getWriter();
		Contract contract=new Contract();
		   List<Contract> list=service.listContract(contract);
			if(list!=null)
			{

				for(int i=0;i<list.size();i++)
				{
					contract=list.get(i);


					printWriter.print("<table border=1 cellpadding='5' width='60%'");
					printWriter.print("<tr>");
					printWriter.print("<h3>"+"<th>"+"CONTRACT ID"+"<th>"+"<td>"+contract.getContractid()+"</td>");
					printWriter.print("<h3>"+"<th>"+"MANAGER ID"+"<th>"+"<td>"+contract.getManagerid()+"</td>");
					printWriter.print("<h3>"+"<th>"+"ORDER ID"+"<th>"+"<td>"+contract.getOrderid()+"</td>");
					printWriter.print("<h3>"+"<th>"+"DELIVERY DATE"+"<th>"+"<td>"+contract.getDeliverydate()+"</td>");
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
