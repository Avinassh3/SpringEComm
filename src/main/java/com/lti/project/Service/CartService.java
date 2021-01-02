package com.lti.project.Service;

public interface CartService {

    public boolean addToCart(int uid,int pid);
    public boolean updateCart(int cid,int qty);
    public boolean deleteCart(int cid);

}
