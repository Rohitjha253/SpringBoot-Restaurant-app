package com.rohit.Restaurant.dao;

import com.rohit.Restaurant.model.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantDao extends CrudRepository<Restaurant,Integer> {
}
