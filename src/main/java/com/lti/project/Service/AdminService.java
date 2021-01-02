package com.lti.project.Service;



import com.lti.project.model.OrderData;
import com.lti.project.model.PaymentData;
import com.lti.project.model.ProductData;
import com.lti.project.model.RetailerSignUp;

import java.util.List;

public interface AdminService {

    // related to retailer
    public boolean approveRetailer(RetailerSignUp retailerSignUp);
    public boolean removeRetailer(int rid);
    public List<RetailerSignUp> getListOfAvailableRetailer();

    // orders
    public List<OrderData> getAllOrders();

    //products
    public List<ProductData> getListOfProducts();
    public boolean removeProduct(int pid);

    //payments
    public List<PaymentData> listOfAllPayments();
}
