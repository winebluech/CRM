package com.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("order")
public class OrderController {

	@RequestMapping("/orderList")
	public String home() {
		System.out.println(1111);
		return "home";
	}
	
}
