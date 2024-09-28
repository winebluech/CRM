package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.model.Menu;
import com.crm.service.SystemService;

@Controller
public class SystemController {
	
	@Autowired
	private SystemService systemService;

	@RequestMapping("/menulist")
	public String menulist(Model model) {
		List<Menu> menulist=systemService.queryAllmenu();
		model.addAttribute("menulist", menulist);
		return "menu/menulist";
	}
	
	
}
