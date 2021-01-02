package com.lti.project.Service;

import com.lti.project.model.ProductData;

import java.util.List;

public interface ProductService {

    public ProductData getProductById(int pid);
    public List<ProductData> getListOfProducts();
    public List<ProductData> getListOfProductsBySearch(String keyword);
    public List<ProductData> getProductsFromFixedCategory(String Cat);
    // all other filter by price,sorting all these can be done from front end


}
