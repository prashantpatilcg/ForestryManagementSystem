package com.fms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutControllerMVC {
	
	
	@RequestMapping(value="/logoutmvc",method=RequestMethod.GET)
	public String logout(HttpSession session) {
	//	session.removeAttribute("username");
		session.invalidate();
		return "index4";
	}
	/*
	 * public ModelAndView doLogout(HttpServletResponse resp, HttpServletRequest
	 * req) throws ServletException, IOException {
	 * 
	 * 
	 * if(session != null) { session.invalidate();
	 * 
	 * }
	 * 
	 * 
	 * return new ModelAndView("fms");
	 * 
	 * }
	 */
	}
