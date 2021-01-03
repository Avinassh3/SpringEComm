package com.lti.project.Service.Impl;

import com.lti.project.Service.UserService;
import com.lti.project.entity.User;
import com.lti.project.entity.WishList;
import com.lti.project.model.Cart;
import com.lti.project.model.Login;
import com.lti.project.model.ProductData;
import com.lti.project.model.UserSignUp;
import com.lti.project.repository.UserRepository;
import com.lti.project.repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    WishListRepository wishListRepository;

    @Override
    public boolean signIn(Login login) {
        if(!userRepository.existsByEmail(login.getEmail()))
        {
            return false;
        }
        //decrypt and compare password
        String pass=userRepository.findByEmail(login.getEmail()).getPassword();
        if(pass.equals(login.getPassword()))
        {
            return true;
        }
        return false;
    }

    @Override
    public UserSignUp signUp(UserSignUp userSignUp) {
        if(!userRepository.existsByEmail(userSignUp.getuEmail()))
        {
            return null;
        }
        User user=new User();
        user.setName(userSignUp.getuName());
        user.setEmail(userSignUp.getuEmail());
        // find a way to encrypt password
        user.setPassword(userSignUp.getuPassword());
        user.setAddress(userSignUp.getuAddress());

        userRepository.save(user);
        return userSignUp;
    }

    @Override
    public UserSignUp updateUser(UserSignUp userSignUp) {
        if(userRepository.existsByEmail(userSignUp.getuEmail()))
        {
            User user=new User();
            user.setName(userSignUp.getuName());
            user.setEmail(userSignUp.getuEmail());
            user.setPassword(userSignUp.getuPassword());
            user.setAddress(userSignUp.getuAddress());
            userRepository.save(user);
            return userSignUp;
        }
        return null;
    }

    @Override
    public boolean forgotPassword(Login login) {
        return false;
    }

    @Override
    public List<WishList> getUserWishList(int uid) {
        if(userRepository.existsById(uid))
        {
            List<WishList> all = wishListRepository.findAll();
            List<WishList> userWishList = new ArrayList<>();
            for(WishList wishlist : all)
            {
                if(wishlist.getUser().getId()==uid)
                {
                    userWishList.add(wishlist);
                }
            }
            return userWishList;
        }
        return null;
    }

    @Override
    public boolean createWishList(int uId, int pId) {
        return false;
    }

    @Override
    public boolean addItemToExistingWishList(int wid,int pid, int qty,int uid) {
        return false;
    }

    @Override
    public boolean removeItemFromWishList(int wid, int pid,int uid) {
        return false;
    }

    @Override
    public boolean deleteWishlist(int wId,int uid) {
        return false;
    }

    @Override
    public Cart getUserCart(int uid) {
        return null;
    }

    @Override
    public boolean addToCart(int uId, int pId) {
        return false;
    }

    @Override
    public Cart updateCart(int cId,int uid, int addOrMinus) {
        return null;
    }

    @Override
    public boolean deleteCart(int cId) {
        return false;
    }

    @Override
    public boolean placeOrder(Cart cart, String payType) {
        return false;
    }

    @Override
    public List<ProductData> listOfProductsInUserHistory(int pid) {
        return null;
    }
}
