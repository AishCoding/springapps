package com.springapps.phaseproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springapps.phaseproject.entity.Login;
import com.springapps.phaseproject.entity.User;
import com.springapps.phaseproject.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	String username1 = "admin", password1 = "admin";

	@RequestMapping(value = "/sportyshoes", method = RequestMethod.POST)
	public String showLoginPage(@ModelAttribute("userlogin") Login user, ModelMap model, String username,
			String passwordone,String passwordtwo) {
		System.out.println(passwordtwo);
		username1 = username;
		password1 = passwordtwo;
		return "login";
	}
	

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegisterationPage(String username, String password) {
		if (username == username1 && password == password1)
			return "userreg";
		else
			return "userreg";
	}

	@RequestMapping("/changePassword")
	public String showPasswordPage() {
		return "changepassword";
	}

	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {

		int result = userService.save(user);
		String message = "Purchase created for Purchase Id: " + result;
		model.addAttribute("result", message);

		List<User> users = userService.getUsers();
		model.addAttribute("users", users);

		return "userreg";
	}

	@RequestMapping(value = "/userTable", method = RequestMethod.POST)
	public String UserTable(@ModelAttribute("usertable") User usertable, ModelMap model, String user_name) {

		model.addAttribute("user_name", user_name);

		List<User> userstable = userService.getSpecificUsers();
		model.addAttribute("usertable", userstable);

		return "userTable";
	}

	@RequestMapping(value = "/categoryTable", method = RequestMethod.POST)
	public String CategoryTable(@ModelAttribute("categorytable") User categorytable, ModelMap model,
			String category_name) {

		model.addAttribute("category_name", category_name);

		List<User> categoriestable = userService.getSpecificCategory();
		model.addAttribute("categorytable", categoriestable);

		return "categoryTable";
	}

	@RequestMapping(value = "/dateTable", method = RequestMethod.POST)
	public String DateTable(@ModelAttribute("datetable") User datetable, ModelMap model, String date_name) {

		model.addAttribute("date_name", date_name);

		List<User> datestable = userService.getSpecificDate();
		model.addAttribute("datetable", datestable);

		return "dateTable";
	}

}
