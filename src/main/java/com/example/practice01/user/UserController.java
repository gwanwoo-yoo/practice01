package com.example.practice01.user;

import com.example.practice01.user.model.User;
import com.example.practice01.user.model.UserFromDatabase;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

//  @GetMapping("/users")
//  public List<User> users(){
//    return userService.findAll();
//  }

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

  @DeleteMapping("/user/{employeeNumber}")
  public Integer deleteUser(
      @PathVariable Integer employeeNumber
  ){
    //Todo : 사용자 삭제 기능 구현
    return employeeNumber;
  }

  @PutMapping("/user/{employeeNumber}")
  public Integer updateUser(
      @PathVariable Integer employeeNumber,
      @RequestBody UserFromDatabase userFromDatabase
  ){
    //Todo : 사용자 정보 변경 기능 구현
    return userService.updateUser(employeeNumber, userFromDatabase);
  }
}
