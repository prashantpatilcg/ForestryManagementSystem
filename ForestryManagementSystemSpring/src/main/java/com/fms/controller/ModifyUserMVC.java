package com.fms.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fms.dto.Users;
import com.fms.service.ForestryManagementService;

@Controller
public class ModifyUserMVC {
	private static String phone="";

	@Autowired
	ForestryManagementService service;
	@RequestMapping(value="/userupdatemvc", method=RequestMethod.GET)
	public ModelAndView updateProfile(ModelAndView mv)
	{
		mv.setViewName("modifyuser");
		return mv;

}    
	@RequestMapping(value="/userupdatemvc1", method=RequestMethod.GET)
	public ModelAndView updateProfile1(ModelAndView mv)
	{
		mv.setViewName("modifyuser1");
		return mv;

}  
	
	
	@RequestMapping(value="/phone", method=RequestMethod.GET)
	public ModelAndView getPhone(ModelAndView modelview)
	
	{
		modelview.setViewName("updatePass");
		return modelview;
	}
	
	@RequestMapping(value="/modifyUser", method=RequestMethod.POST)
	public String doApplicationUpdate(HttpServletResponse resp,
			@RequestParam("userid") String userid,
			@RequestParam("username") String username,
			@RequestParam("address") String address,
			@RequestParam("contactno") String contactno,
			@RequestParam("emailid") String emailid,
			@RequestParam("password") String password ,
			@RequestParam("role") String role ,
			Users user, ModelAndView mv) throws ServletException, IOException {
		{
		  
		 user.setUserid(Integer.parseInt(userid));
		 user.setUsername(username);
		 user.setAddress(address);
		 user.setContactno(contactno);
		 user.setEmailid(emailid);
		 user.setPassword(password);
		 user.setRole(role);
		 
		 
		 
		 
		  boolean state=service.modifyUser(user);
			
	    	if(state==true)
			{
	    		return "Success";
				
			}else
			{
				return "Fail";
				
			}
	}
	 
	
	
}
	
	@RequestMapping(value="/updatePass", method=RequestMethod.POST)
	public String doApplicationUpdate2(HttpServletResponse resp,
			@RequestParam("password") String password ,
			Users user, ModelAndView mv) throws ServletException, IOException {
		{
		 user.setContactno(phone);
		 user.setPassword(password);
		  
		  boolean state=service.updatePassword(user);
			
	    	if(state==true)
			{
	    		return "index1";
				
			}else
			{
				return "Fail";
				
			}
	}
	 
	
	
}
	@RequestMapping(value="/getPhoneno", method=RequestMethod.POST)
	public ModelAndView getPhone(HttpServletResponse resp,HttpServletRequest req,
			@RequestParam("contactno") String contactno,
			HttpSession session, ModelAndView modelview) throws ServletException, IOException
	{
		Users user=service.getPhoneno(contactno);
		
		if(user!=null)
		{
			phone=user.getContactno();
			return new  ModelAndView("updatePass1");
		}
		
			
		
		

		else{
			return new  ModelAndView("index3");
		}

	}
}
