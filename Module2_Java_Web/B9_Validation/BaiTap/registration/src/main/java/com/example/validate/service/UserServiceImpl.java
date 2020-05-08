package com.example.validate.service;

import com.example.validate.model.User;
import com.example.validate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user){
       return userRepository.save(user);
    }

    @Override
    public List<User> findAllByEmail (String email){
        return userRepository.findAllByEmail(email);
    }
}
