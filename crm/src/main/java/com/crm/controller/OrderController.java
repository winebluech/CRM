package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.model.Order;
import com.crm.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderservice;
	
	@RequestMapping("/orderList")
	public String home(Model model) {
		List<Order> orderList=orderservice.QueryAllOutOrders();
		
		model.addAttribute("orderList", orderList);
		System.out.println("orderlist________________"+orderList.size());
		return "order/orderList";
	}
	
}
