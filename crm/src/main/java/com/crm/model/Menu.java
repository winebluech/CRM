package com.crm.model;

import java.util.List;

public class Menu {

	private String id;
	private String menuCode;
	private String menuName;
	private String parentId;
	private String path;
	private String level;
	private int is_menu;
	private List <Menu> childerMenus;
	
	private String is_delete;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(String is_delete) {
		this.is_delete = is_delete;
	}
	public List<Menu> getChilderMenus() {
		return childerMenus;
	}
	public void setChilderMenus(List<Menu> childerMenus) {
		this.childerMenus = childerMenus;
	}
	public int getIs_menu() {
		return is_menu;
	}
	public void setIs_menu(int is_menu) {
		this.is_menu = is_menu;
	}
	
	
	
	
}
