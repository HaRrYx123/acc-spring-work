package com.spring.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.registration.model.Login;
import com.spring.registration.model.User;
import com.spring.registration.service.UserService;

@Controller
public class RegistrationController {

  @Autowired
  public UserService userService;

  @PostMapping(value = "/registrationProcess")
  public String addUser(@ModelAttribute("user") User user, ModelMap model) {
    userService.addUser(user);
    model.addAttribute("username", user.getUsername());

    return "welcome";
  }
}