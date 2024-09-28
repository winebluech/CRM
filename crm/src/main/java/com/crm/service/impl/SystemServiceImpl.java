package com.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.dao.MenuDao;
import com.crm.model.Menu;
import com.crm.service.SystemService;

@Service
public class SystemServiceImpl implements SystemService {
	
	@Autowired
	private MenuDao menuDao;
	
	
	public List<Menu> queryAllmenu(){
		
		List<Menu> menulist=menuDao.queryAllMenu();
		
		return menulist;
	}
	

}
