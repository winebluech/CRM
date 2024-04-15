package com.crm.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.dao.OrderDao;
import com.crm.dao.ProductInfoDao;
import com.crm.model.Order;
import com.crm.model.OrderProduct;
import com.crm.model.ProductInfo;
import com.crm.service.OrderService;
import com.crm.unit.SnowFlake;

@Service
public class OrderServiceImpl implements OrderService {
	
	
	
	  @Autowired 
	  private OrderDao orderDao;
	  @Autowired
	  private ProductInfoDao productInfoDao;
	 
	 
	
	public List<Order> QueryAllOrders(){
		return null;
		
		
	}
	
	public List<Order> QueryAllOutOrders(){
		
		
		List<Order> orderList=orderDao.queryOrderByOrderType(1);
		
		return orderList;
	}
	
	public List<Order> QueryAllInOrders(){
		List<Order> orderList=orderDao.queryOrderByOrderType(0);
		return orderList;
	}

	@Override
	public List<ProductInfo> toAddOrderOutService() {
		
		List<ProductInfo> productInfoList=productInfoDao.queryAllProductInfo();
		
		return productInfoList;
	}
	
	@Transactional
	public void addOrder(Order order) {
		order.setOrderCode(SnowFlake.getOrderNum());
		order.setOrderStatus("0");
		order.setIs_delete(0);
		if(order.getOrderDate()==null) {
			order.setOrderDate(new Date());
		}
		orderDao.addOrder(order);
		orderDao.addOrderProduct(order);
	}

	@Override
	public Double getProductPrice(String productCode, String weight) {
		Order order=orderDao.getProductPriceForProductCodeAndWeight(productCode,weight);
		if(order==null) {
			return null;
		}else if(order.getUnitprice()!=null){
			
			Double d1=Double.parseDouble(order.getUnitprice().toString());
			return d1;
		}else {
			return null;
		}
		
		
	}

	@Override
	public Order queryOrderByOrderCode(String orderCode) {
		Order order=orderDao.queryOrderByOrderCode(orderCode);
		return order;
	}

	@Override
	@Transactional
	public void editOrderByOrderCode(Order order) {
		if(order.getOrderDate()!=null) {
			orderDao.updateOrderByOrderCode(order);
		}
		if(order.getProductCode()!=null || order.getQuantity()!=null || order.getWeight()!=null || order.getUnitprice()!=null) {
			orderDao.updateOrderProductByOrderCode(order);
		}
		
	}
	@Transactional
	public void deleteOrderAndOrderProductByOrderCode(String orderCode) {
		
		orderDao.deleteOrderByOrderCode(orderCode);
		orderDao.deleteOrderProductByOrderCode(orderCode);
	}
	

}
