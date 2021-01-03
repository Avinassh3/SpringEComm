package com.lti.project.Service;

import com.lti.project.entity.WishList;
import com.lti.project.model.Cart;
import com.lti.project.model.Login;
import com.lti.project.model.ProductData;
import com.lti.project.model.UserSignUp;

import java.util.List;

public interface UserService {

    // related to login registration and user data
    public boolean signIn(Login login);
    public UserSignUp signUp(UserSignUp userSignUp);
    public UserSignUp updateUser(UserSignUp userSignUp);
    public boolean forgotPassword(Login login);
    //need to add forgot password option

    // related to User's WishList
    public List<WishList> getUserWishList(int uid);
    public boolean createWishList(int uId, int pId);
    public boolean addItemToExistingWishList(int wid,int pid,int qty,int uid);
    public boolean removeItemFromWishList(int wid,int pid,int uid);
    public boolean deleteWishlist(int wId,int uid);

    // related to users cart
    public Cart getUserCart(int uid);
    public boolean addToCart(int uId, int pId);
    public Cart updateCart(int cId,int uid ,int addOrMinus);
    public boolean deleteCart(int cId);

    // related users orders
    public boolean placeOrder(Cart cart, String payType);
    public List<ProductData> listOfProductsInUserHistory(int pid);
    // can think of modifying order and deleting order which are placed


}
