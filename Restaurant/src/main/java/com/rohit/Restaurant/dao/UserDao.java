package com.rohit.Restaurant.dao;

import com.rohit.Restaurant.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {

}
