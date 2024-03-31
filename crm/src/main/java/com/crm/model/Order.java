package com.crm.model;

import java.util.Date;
import java.util.List;

public class Order {

	private String id;
	private String orderType;
	private Date orderDate;
	private String orderCode;
	
	private String orderStatus;
	private String remark;
	private String is_delete;
	/**
	 * 订单详情
	 */
	private OrderProduct orderProduct;
	/**
	 * 订单详情列表
	 */
	private List<OrderProduct> orderDetails;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(String is_delete) {
		this.is_delete = is_delete;
	}
	public List<OrderProduct> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderProduct> orderDetails) {
		this.orderDetails = orderDetails;
	}
	public OrderProduct getOrderProduct() {
		return orderProduct;
	}
	public void setOrderProduct(OrderProduct orderProduct) {
		this.orderProduct = orderProduct;
	}

	
	
	
}
