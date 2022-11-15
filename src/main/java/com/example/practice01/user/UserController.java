package com.example.practice01.user;

import com.example.practice01.user.model.User;
import com.example.practice01.user.model.UserFromDatabase;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  private UserService userService;
  public UserController(UserService userService) {
    this.userService = userService;
  }

//  @GetMapping("/user")
//  public Boolean user(){
//    return true;
//  }

  @GetMapping("/users")
  public List<User> users(){
    return userService.findAll();
  }

  @GetMapping("/userFromDatabase")
  public List<UserFromDatabase> userFromDatabase(){
    return userService.findAllFromDatabase();
  }

  @GetMapping("/user")
  public List<UserFromDatabase> getUser(
      @RequestParam(name="firstName", required = false) String firstName,
      @RequestParam(name="lastName", required = false) String lastName
  ){
    return userService.getUser(firstName, lastName);
  }

  @PostMapping("/user")
  public Integer insertUser(
    @RequestBody UserFromDatabase userFromDatabase
  ){
    return userService.insertUser(userFromDatabase);
  }

}
