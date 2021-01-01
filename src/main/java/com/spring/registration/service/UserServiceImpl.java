package com.spring.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.registration.dao.UserRepository;
import com.spring.registration.model.Login;
import com.spring.registration.model.User;
 
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  public UserRepository userRepo;

  public void addUser(User user) {
    userRepo.save(user);
  }

  public User validateUser(Login login) {
    return userRepo.findById(login.getUsername()).get();
  }

}