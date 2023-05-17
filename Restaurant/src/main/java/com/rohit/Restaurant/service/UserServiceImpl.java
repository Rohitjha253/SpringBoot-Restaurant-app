package com.rohit.Restaurant.service;

import com.rohit.Restaurant.dao.UserDao;
import com.rohit.Restaurant.model.Restaurant;
import com.rohit.Restaurant.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public String saveUsers(List<User> users) {
        userDao.saveAll(users);
        return "User saved "+users.size();
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) userDao.findAll();
    }

    @Override
    public Optional<User> getUser(Integer userId) {
        return (Optional<User>) userDao.findById(userId);
    }

    @Override
    public String updateUser(User user) {
        userDao.save(user);
        return "user updated";
    }

    @Override
    public String deleteUser(Integer id) {
        userDao.deleteById(id);
        return "user deleted";
    }
}
