package com.crm.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.dao.OrderDao;
import com.crm.dao.ProductInfoDao;
import com.crm.model.Order;
import com.crm.model.OrderProduct;
import com.crm.model.ProductInfo;
import com.crm.service.OrderService;

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
}
