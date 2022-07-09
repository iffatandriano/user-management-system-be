package com.dailycodeia.usermanagementsystem.service;

import com.dailycodeia.usermanagementsystem.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    boolean deleteUser(Long id);

    User updateUserById(Long id, User user);
}
