package com.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.crm.model.Order;

	@Mapper
	public interface OrderDao {

	List<Order> queryOrderByOrderType(int orderType);
	
	}
