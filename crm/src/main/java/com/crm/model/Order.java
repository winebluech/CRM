package com.crm.model;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class Order {

	private String id;
	private Integer orderType;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date orderDate;
	private String orderCode;
	
	private String orderStatus;
	private String remark;
	private Integer is_delete;
	
	private String orderAddress;
	
	//订单详情
	private String productCode;
	private String productName;
	private Integer quantity;
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
	/**
	 * 结算
	 */
	private BigDecimal settlement;
	
	
	
	//订单价格补充
	/**
	 * 运费
	 */
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
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
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
	public Integer getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(Integer is_delete) {
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
	public String getTotalPrice() {
		BigDecimal b1=new BigDecimal(getQuantity());
		BigDecimal b2=new BigDecimal(getWeight());
		BigDecimal b3=getUnitprice();
		BigDecimal b4=new BigDecimal(1000);
		DecimalFormat df=new DecimalFormat("0.00");
		//df.format(b3.multiply(b1.divide(b4.divide(b2))));
		return df.format(b3.multiply(b1.divide(b4.divide(b2))));
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
	public BigDecimal getSettlement() {
		return settlement;
	}
	public void setSettlement(BigDecimal settlement) {
		this.settlement = settlement;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	
	
	
}
