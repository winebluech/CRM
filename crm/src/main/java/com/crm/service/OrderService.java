package com.crm.service;

import java.util.List;

import com.crm.model.Order;
import com.crm.model.ProductInfo;

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
	/**
	 * 
	 * @return
	 */
	public List<ProductInfo> toAddOrderOutService();
	/**
	 * 添加订单
	 */
	public void addOrder(Order order);
	/**
	 * 获取商品近期的价格
	 * @param productCode
	 * @param weight
	 * @return
	 */
	public Double getProductPrice(String productCode, String weight);
	/**
	 * 
	 * @param orderCode 
	 * @return
	 */
	public Order queryOrderByOrderCode(String orderCode);
	/**
	 * 
	 * @param order
	 */
	public void editOrderByOrderCode(Order order);
}
