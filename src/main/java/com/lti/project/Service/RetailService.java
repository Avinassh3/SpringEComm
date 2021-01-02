package com.lti.project.Service;

import com.lti.project.entity.Product;
import com.lti.project.model.Login;
import com.lti.project.model.ProductData;
import com.lti.project.model.RetailerSignUp;
import com.lti.project.model.UserSignUp;

public interface RetailService {
    // related to login registration and user data
    public boolean signIn(Login login);
    public RetailerSignUp signUp(RetailerSignUp retailerSignUp);
    public RetailerSignUp updateRetailer(RetailerSignUp retailerSignUp);

    // related to products
    public ProductData registerProductAndAddInInventory(ProductData productData,int r_id);
    public ProductData updateQuantityInInventory(int inv_id,int qty);
    public ProductData deRegisterAndRemoveFromInventory(int inv_id);

    // might add amount of goods sold and profits made


}
