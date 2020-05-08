package com.example.validate.service;

import com.example.validate.model.User;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> findAllByEmail (String email);
}
