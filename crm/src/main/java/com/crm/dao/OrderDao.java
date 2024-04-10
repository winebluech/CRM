package com.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.crm.model.Order;

	@Mapper
	public interface OrderDao {

	List<Order> queryOrderByOrderType(int orderType);

	void addOrder(Order order);

	void addOrderProduct(Order order);

	Order getProductPriceForProductCodeAndWeight(String productCode, String weight);

	Order queryOrderByOrderCode(String orderCode);

	void updateOrderByOrderCode(Order order);

	void updateOrderProductByOrderCode(Order order);
	
	}
