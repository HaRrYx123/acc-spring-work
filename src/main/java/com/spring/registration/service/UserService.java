package com.spring.registration.service;

import org.springframework.stereotype.Service;

import com.spring.registration.model.Login;
import com.spring.registration.model.User;

@Service
public interface UserService {

  void addUser(User user);

  User validateUser(Login login);
}
