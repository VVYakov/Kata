package com.example.demo.service;

import com.example.demo.model.User;


import java.util.List;

public interface UserService {
    void addUser(User user);

    User updateUser(User user, long id);

    void deleteUser(long id);

    User getUserById(long id);

    List<User> getUsers();
}