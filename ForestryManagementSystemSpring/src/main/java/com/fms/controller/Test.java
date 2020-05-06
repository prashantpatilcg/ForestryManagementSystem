package com.fms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {
	
	
	@RequestMapping(value="/pmanagerhome", method=RequestMethod.GET)
	public ModelAndView getPmanagerHome(ModelAndView mv)
	{
		mv.setViewName("PmanagerHome");
		
		return mv;
		
	}
	@RequestMapping(value="/customerhome", method=RequestMethod.GET)
	public ModelAndView getCustomerHome(ModelAndView mv)
	{
		mv.setViewName("CustomerHome");
		
		return mv;
		
	}
	@RequestMapping(value="/adminhome", method=RequestMethod.GET)
	public ModelAndView getAdminHome(ModelAndView mv)
	{
		mv.setViewName("AdminHome");
		
		return mv;
		
	}
}
