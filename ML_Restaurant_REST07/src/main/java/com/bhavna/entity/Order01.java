package com.bhavna.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
public class Order01 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderId=1;
	private String orderCategory;
	private Date orderDate;
	private Date deliveryDate;
	private String oderStatus;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderCategory() {
		return orderCategory;
	}

	public void setOrderCategory(String orderCategory) {
		this.orderCategory = orderCategory;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getOderStatus() {
		return oderStatus;
	}

	public void setOderStatus(String oderStatus) {
		this.oderStatus = oderStatus;
	}

	public Order01(int orderId, String orderCategory, Date orderDate, Date deliveryDate, String oderStatus) {
		super();
		this.orderId = orderId;
		this.orderCategory = orderCategory;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.oderStatus = oderStatus;
	}

	public Order01() {
		super();
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderCategory=" + orderCategory + ", orderDate=" + orderDate
				+ ", deliveryDate=" + deliveryDate + ", oderStatus=" + oderStatus + "]";
	}

}
