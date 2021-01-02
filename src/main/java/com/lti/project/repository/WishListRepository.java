package com.lti.project.repository;

import com.lti.project.entity.WishList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishListRepository extends JpaRepository<WishList,Integer> {
}
