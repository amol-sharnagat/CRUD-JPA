package com.cjc.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.User;
import com.cjc.main.service.HomeService;
@Controller
public class HomeController {
	
	@Autowired
	HomeService hs;

	@RequestMapping("/")
	public String firstpage()
	{
		return "login";
	}
	
	@RequestMapping("/register")
	public String preregister()
	{
		return "register";
	}
	
	
	@RequestMapping("/reg")
	public String registerData(@ModelAttribute("user") User u)
	{
		hs.savedata(u);
		return "login";	
	}

	@RequestMapping("/log")
	public String loginData(@RequestParam("username") String username,@RequestParam("password") String password, Model m)
	{
		Iterable<User> u=hs.loginData(username,password);
		
		/*
		 * if(u!=null) { Iterable<User> ulist=hs.getAllData(); m.addAttribute("data",
		 * ulist); return "success"; }
		 */
		
		if(username.equals("admin") && password.equals("admin")) {
			
			Iterable<User> ulist=hs.getAllData();
			m.addAttribute("data", ulist);
			return "success";
		}
		
		else {
			if(u!=null)
			{
				Iterable<User> ulist=hs.loginData(username,password);
				m.addAttribute("data", ulist);
				return "success";
				
			}
		}
		
		return "login";
	}
	
	@RequestMapping("/delete")
	public String deleteData(@ModelAttribute("user") User u, Model m)
	{
		hs.deleteData(u);
		Iterable<User> ulist=hs.getAllData();
		m.addAttribute("data", ulist);
		return "success";
	}
	@RequestMapping("/edit")
	public String editData(@RequestParam("uid") int uid, Model m)
	{
		User u=hs.editData(uid);
		m.addAttribute("ur", u);
		
		return "edit";
	}
	@RequestMapping("/update")
	public String updateData(@ModelAttribute("user") User u, Model m)
	{
		hs.savedata(u);
		Iterable<User> ulist=hs.getAllData();
		m.addAttribute("data", ulist);
		return "success";
	}
	@RequestMapping("/add")
	public String addData()
	{
		return "register";
	}
}
