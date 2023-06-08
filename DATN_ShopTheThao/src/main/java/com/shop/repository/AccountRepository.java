package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.entity.Account;
import com.shop.entity.Product;

public interface AccountRepository  extends JpaRepository<Account, String>{

}
