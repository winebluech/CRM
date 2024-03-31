package com.crm.service;

import java.util.List;

import com.crm.model.Order;

public interface OrderService {

	/**
	 * 查询所有订单
	 * @return
	 */
	public List<Order> QueryAllOrders();
	/**
	 * 查询所有出库订单
	 * @return
	 */
	public List<Order> QueryAllOutOrders();
	
	/**
	 * 查询所有入库订单
	 * @return
	 */
	public List<Order> QueryAllInOrders();
}
