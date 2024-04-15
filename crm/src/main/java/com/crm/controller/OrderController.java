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
	
	@RequestMapping("/orderoutlist")
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
			return "redirect:/order/orderoutlist";
		}else if (order.getOrderType()==2) {
			return "redirect:/order/orderoutlist";
		}else {
			return "redirect:/order/orderoutlist";
		}
		
	}
	
	@RequestMapping("/orderdelete")
	public String orderdelete(String orderCode,int orderType) {
		
		if(orderType==1) {
			orderservice.deleteOrderAndOrderProductByOrderCode(orderCode);
			return "redirect:/order/orderoutlist";
		}else if (orderType==2) {
			return "redirect:/order/orderoutlist";
		}else {
			return "redirect:/order/orderoutlist";
		}
		
	}
	
	@GetMapping("/orderedit")
	@ResponseBody
	public String orderedit( Order order) {
		orderservice.editOrderByOrderCode(order);
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
