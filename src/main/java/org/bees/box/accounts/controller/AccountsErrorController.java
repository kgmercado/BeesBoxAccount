package org.bees.box.accounts.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class AccountsErrorController implements ErrorController{

	@RequestMapping(value="/error")
	public String showError() {
		return "Something went wrong";
	}
	
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error";
	}

	
}
