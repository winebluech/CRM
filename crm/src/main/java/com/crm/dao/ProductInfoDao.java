package com.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.crm.model.Order;
import com.crm.model.ProductInfo;

	@Mapper
	public interface ProductInfoDao {

	List<ProductInfo> queryAllProductInfo();
	
	}
