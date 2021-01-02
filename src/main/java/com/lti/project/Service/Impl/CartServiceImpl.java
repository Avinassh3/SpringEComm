package com.lti.project.Service.Impl;

import com.lti.project.entity.Cart;
import com.lti.project.entity.Product;
import com.lti.project.entity.User;
import com.lti.project.repository.CartRepository;
import com.lti.project.repository.ProductRepository;
import com.lti.project.repository.UserRepository;
import com.lti.project.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProductRepository productRepository;

    @Override
    public boolean addToCart(int uid, int pid) {
        if(productRepository.existsById(pid) && userRepository.existsById(uid))
        {
            Cart cart = new Cart();
            Product product = productRepository.findById(pid).get();
            User user=userRepository.findById(uid).get();
            cart.setProduct(product);
            cart.setUser(user);
            cart.setQuantity(1);
            cartRepository.save(cart);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateCart(int cid, int qty) {

        if(cartRepository.existsById(cid))
        {
            Cart cart = cartRepository.findById(cid).get();
            int finallyQty=cart.getQuantity()+qty;
            if(finallyQty>=0)
            {
                cart.setId(finallyQty);
                cartRepository.save(cart);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean deleteCart(int cid) {
        if(cartRepository.existsById(cid))
        {
            cartRepository.deleteById(cid);
            return true;
        }

        return false;
    }
}
