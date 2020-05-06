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

import com.fms.service.ForestryManagementService;

@Controller
public class DeleteOrderMVC {
	
	@Autowired
	ForestryManagementService service;
	
	
	@RequestMapping(value="/deleteordermvc", method=RequestMethod.GET)
	public ModelAndView getApplicationReject(ModelAndView mv)
	{
		mv.setViewName("deleteorder");
		return mv;

}
	
	@RequestMapping(value="/deleteOrder", method=RequestMethod.POST)
	public String doDelete(HttpServletResponse resp,HttpServletRequest req , 
			@RequestParam("orderid") String orderid,ModelAndView modelview) throws ServletException,IOException {
	
		
		
		
		boolean state = service.deleteOrders(Integer.parseInt(orderid));
		
		
		   
		    if(state)
			{
		    	
				
		    	return "Success";
		    	
			}else
			{
				return "Fail";
			}
		
	}
	}
	
	



