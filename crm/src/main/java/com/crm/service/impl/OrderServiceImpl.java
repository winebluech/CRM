package com.crm.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.stereotype.Service;

import com.crm.model.Order;
import com.crm.model.OrderProduct;
import com.crm.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	public List<Order> QueryAllOrders(){
		return null;
		
		
	}
	
	public List<Order> QueryAllOutOrders(){
		Order order =new Order();
		order.setOrderCode("20240103");
		order.setOrderStatus("0");
		order.setOrderDate(new Date());
		OrderProduct op=new OrderProduct();
		op.setProductCode("PT-100");
		op.setQuantity(50);
		op.setUnitprice(new BigDecimal(2200));
		op.setWeight("50kg");
		List<OrderProduct> lo= new ArrayList<OrderProduct>();
		lo.add(op);
		for (OrderProduct orderProduct : lo) {
			order.setOrderProduct(orderProduct);
		}
		
		List<Order> orderList=new ArrayList<Order>();

		orderList.add(order);
		orderList.add(order);
		
		
		return orderList;
	}
	
	public List<Order> QueryAllInOrders(){
		
		return null;
	}
}
