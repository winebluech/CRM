package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.model.Order;
import com.crm.model.ProductInfo;
import com.crm.service.OrderService;

import jakarta.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderservice;
	
	@RequestMapping("/orderOutList")
	public String orderOutList(Model model) {
		List<Order> orderList=orderservice.QueryAllOutOrders();
		
		model.addAttribute("orderList", orderList);
		System.out.println("orderlist________________"+orderList.size());
		return "order/orderList";
	}
	
	@RequestMapping("/orderaddpage")
	public String orderAddPage(Model model) {
		
		List<ProductInfo> productList=orderservice.toAddOrderOutService();
		model.addAttribute("productList", productList);
		return "order/orderOutAdd";
	}
	
	@RequestMapping("/ordereditpage")
	public String orderEditPage(Model model,String orderCode) {
		Order order=orderservice.queryOrderByOrderCode(orderCode);
		List<ProductInfo> productList=orderservice.toAddOrderOutService();
		model.addAttribute("productList", productList);
		model.addAttribute("order", order);
		return "order/orderOutEdit";
	}
	
	
	@RequestMapping("/orderadd")
	public String orderAdd(Order order,Model model) {
		System.out.println(order.getOrderType());
		
		if(order.getOrderType()==1) {
			orderservice.addOrder(order);
			return "redirect:/order/orderOutList";
		}else if (order.getOrderType()==2) {
			return "redirect:/order/orderOutList";
		}else {
			return "redirect:/order/orderOutList";
		}
		
	}
	
	@GetMapping("/orderedit")
	@ResponseBody
	public String orderedit( String orderCode) {
		//System.out.println(order.getOrderCode()+"---"+order.getProductCode()+"--"+order.getWeight());
		System.out.println(orderCode);
		return "200";
		
	}
	
	
	
	@GetMapping("/getProductPrice")
	@ResponseBody
	public Double getProductPrice(String productCode,String weight,HttpServletResponse response) {
		response.addHeader("Access-Allow-Control-Origin","*");
		Double price=orderservice.getProductPrice(productCode,weight);
		return price;
		
	}
	
}
