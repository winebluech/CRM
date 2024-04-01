package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order {

	private String id;
	private Integer orderType;
	private Date orderDate;
	private String orderCode;
	
	private String orderStatus;
	private String remark;
	private String is_delete;
	
	//订单详情
	private String productCode;
	private String productName;
	private Double quantity;
	private Double weight;
	/**
	 * 单价
	 */
	private BigDecimal unitprice;
	/**
	 * 总价
	 */
	private BigDecimal totalPrice;
	/**
	 * 预计盈利
	 */
	private BigDecimal profit;
	
	
	
	//订单补充
	private BigDecimal orderFreight;
	private BigDecimal orderHandlingCharge;
	private BigDecimal alternatefieldone;
	private BigDecimal alternatefieldtwo;
	private BigDecimal alternatefieldthree;
	
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

	
	
	public Integer getOrderType() {
		return orderType;
	}
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public BigDecimal getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(BigDecimal unitprice) {
		this.unitprice = unitprice;
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
	public BigDecimal getOrderFreight() {
		return orderFreight;
	}
	public void setOrderFreight(BigDecimal orderFreight) {
		this.orderFreight = orderFreight;
	}
	public BigDecimal getOrderHandlingCharge() {
		return orderHandlingCharge;
	}
	public void setOrderHandlingCharge(BigDecimal orderHandlingCharge) {
		this.orderHandlingCharge = orderHandlingCharge;
	}
	public BigDecimal getAlternatefieldone() {
		return alternatefieldone;
	}
	public void setAlternatefieldone(BigDecimal alternatefieldone) {
		this.alternatefieldone = alternatefieldone;
	}
	public BigDecimal getAlternatefieldtwo() {
		return alternatefieldtwo;
	}
	public void setAlternatefieldtwo(BigDecimal alternatefieldtwo) {
		this.alternatefieldtwo = alternatefieldtwo;
	}
	public BigDecimal getAlternatefieldthree() {
		return alternatefieldthree;
	}
	public void setAlternatefieldthree(BigDecimal alternatefieldthree) {
		this.alternatefieldthree = alternatefieldthree;
	}
	public BigDecimal getTotalPrice() {
		BigDecimal b1=new BigDecimal(getQuantity());
		BigDecimal b2=new BigDecimal(getWeight());
		BigDecimal b3=getUnitprice();
		BigDecimal b4=new BigDecimal(1000);
		return b3.multiply(b1.divide(b4.divide(b2,BigDecimal.ROUND_CEILING),BigDecimal.ROUND_CEILING));
	}
	public void setTotalPrice(BigDecimal totalPrice) {

		this.totalPrice = totalPrice;
	}
	public BigDecimal getProfit() {
		return profit;
	}
	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}

	
	
	
}
