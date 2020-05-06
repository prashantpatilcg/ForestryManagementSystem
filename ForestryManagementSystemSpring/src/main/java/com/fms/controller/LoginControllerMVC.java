package com.fms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fms.dto.Users;
import com.fms.service.ForestryManagementService;

@Controller
public class LoginControllerMVC {
		@Autowired
		ForestryManagementService service;
		

		
		@RequestMapping(value="/front", method=RequestMethod.GET)
		public ModelAndView getLogin(ModelAndView modelview)
		
		{
			modelview.setViewName("Front");
			return modelview;
		}
		
		
		
		
		@RequestMapping(value="/loginmvclog", method=RequestMethod.POST)
		public ModelAndView doLogin(HttpServletResponse resp,HttpServletRequest req,
				@RequestParam("username") String username,
				@RequestParam("password") String password,
				@RequestParam("role") String role,
				HttpSession session, ModelAndView modelview) throws ServletException, IOException
		{
			Users user=service.login(username, password,role);

			
			if(user!=null) 
			{
				//session.setAttribute("username", username);
				if(user.getRole().equals("Admin"))         
				{
					modelview.addObject("user", user);   
		            
					return new  ModelAndView("AdminHome");
					
				}
				if(user.getRole().equals("Manager"))         
				{
					modelview.addObject("user", user);   
		            
		        	//mv.setViewName("admin");
					return new  ModelAndView("PmanagerHome");
					
				}
			
			else if(user.getRole().equals("Customer") ) {
				
				modelview.addObject("user", user);			        
				return new  ModelAndView("CustomerHome");
				
				
		}
			}
			
			else
				return new  ModelAndView("Fail");
			
			return modelview;

		}
			
			}


		
	

	


