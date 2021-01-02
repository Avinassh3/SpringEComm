package com.lti.project.model;

public class PaymentData {


    private int orderId;
    private int paymentType;

    public PaymentData(int orderId, int paymentType) {
        this.orderId = orderId;
        this.paymentType = paymentType;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }
}
