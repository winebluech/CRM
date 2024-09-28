package com.crm.unit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.dao.MenuDao;
import com.crm.model.Menu;

@RestController
public class TestUnit {
	
	@Autowired
	private MenuDao menuDao;
	
	@GetMapping("testmenu")
	public List<Menu> testMenu() {
		List<Menu> menulist=menuDao.queryAllMenu();
		return menulist;
	}
}
