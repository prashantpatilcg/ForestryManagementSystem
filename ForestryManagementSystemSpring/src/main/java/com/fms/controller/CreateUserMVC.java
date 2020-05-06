package com.fms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fms.dto.Users;
import com.fms.service.ForestryManagementService;

@Controller
public class CreateUserMVC {
	@Autowired
	ForestryManagementService service;
	@RequestMapping(value="/createusermvc", method=RequestMethod.GET)
	public ModelAndView getApplicationUpdate(ModelAndView modelview)
	{
		modelview.setViewName("CustomerMenu");
		return modelview;

}      
	@RequestMapping(value="/createusermvc1", method=RequestMethod.GET)
	public ModelAndView createProfile(ModelAndView modelview)
	{
		modelview.setViewName("createuser");
		return modelview;

} 
	@RequestMapping(value="/createusermvc2", method=RequestMethod.GET)
	public ModelAndView createProfile2(ModelAndView modelview)
	{
		modelview.setViewName("ManagerMenu");
		return modelview;

}      
	@RequestMapping(value="/createusermvc3", method=RequestMethod.GET)
	public ModelAndView createProfile3(ModelAndView modelview)
	{
		modelview.setViewName("createuser1");
		return modelview;

} 
	
	
	@RequestMapping(value="/createuser", method=RequestMethod.POST)
	public String doApplicationUpdate(@Valid @ModelAttribute("user") Users user, BindingResult result ) throws ServletException, IOException {
		{
		  if(result.hasErrors()) {
			  return "createuser";
		  }
		 
		
		  boolean state=service.createUser(user);
			
	    	if(state==true)
			{
				
	    		return "index";
			}else
			{
				return "Fail";
			}
	}
}
	
	
}
