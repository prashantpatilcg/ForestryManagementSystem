package com.fms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fms.dto.Product;
import com.fms.service.ForestryManagementService;




@Controller
public class ListProducts {
	@Autowired
	ForestryManagementService service;
	
	@RequestMapping(value="/listOfProductmvc",method=RequestMethod.GET)
	public ModelAndView getPrograms(ModelAndView mv){
		mv.setViewName("product");
		return mv;
	}
	
	@RequestMapping(value="/listOfProducts", method=RequestMethod.GET)
	public void listAllProgramsOffered(HttpServletResponse resp,ModelAndView mv) throws IOException
	{
		PrintWriter printWriter=resp.getWriter();
		Product product=new Product();
		   List<Product> list=service.listProducts(product);
			if(list!=null)
			{

				for(int i=0;i<list.size();i++)
				{
					product=list.get(i);


					printWriter.print("<table border=1 cellpadding='5' width='60%'");
					printWriter.print("<tr>");
					printWriter.print("<h3>"+"<th>"+"PRODUCT ID"+"<th>"+"<td>"+product.getProductid()+"</td>");
					printWriter.print("<h3>"+"<th>"+"PRODUCT NAME"+"<th>"+"<td>"+product.getProductname()+"</td>");
					printWriter.print("<h3>"+"<th>"+"DESCRIPTION"+"<th>"+"<td>"+product.getProductdescription()+"</td>");
					printWriter.print("<h3>"+"<th>"+"PRICE"+"<th>"+"<td>"+product.getPrice()+"</td>");
					printWriter.print("</tr>");
					printWriter.print("</table>");
				}
			}
			else
			{
				printWriter.print("<h1>"+"something went wrong"+"</h1>");
			}
}}
