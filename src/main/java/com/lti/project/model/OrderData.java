package com.lti.project.model;

import java.util.Date;

public class OrderData {
    private Date purchasedate;
    private int quantity;
    private double price;
    private Date deliverydate;
    private ProductData productData;
    private int orderID;

    public OrderData(Date purchasedate, int quantity, double price, Date deliverydate, ProductData productData, int orderID) {
        this.purchasedate = purchasedate;
        this.quantity = quantity;
        this.price = price;
        this.deliverydate = deliverydate;
        this.productData = productData;
        this.orderID = orderID;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public ProductData getProductData() {
        return productData;
    }

    public void setProductData(ProductData productData) {
        this.productData = productData;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
}
