package com.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.crm.model.Menu;
import com.crm.model.Order;

	@Mapper
	public interface MenuDao {

		public List<Menu> queryAllMenu();
		
	}
