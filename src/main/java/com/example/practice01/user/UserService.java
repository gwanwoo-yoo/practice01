package com.example.practice01.user;

import com.example.practice01.user.model.User;
import com.example.practice01.user.model.UserFromDatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private static List<User> users = new ArrayList<>();
  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  private static int usersCount = 3;

  static {
    users.add(new User(1, "JunIl", new Date()));
    users.add(new User(2, "Min", new Date()));
    users.add(new User(3, "Sam", new Date()));
  }

  public List<User> findAll() {
    return users;
  }

  public User save(User user) {
    if (user.getId() == null) {
      user.setId(++usersCount);
    }
    users.add(user);
    return user;
  }

  public List<UserFromDatabase> findAllFromDatabase() {
    return userRepository.getUsers();
  }

  public List<UserFromDatabase> getUser(String firstName, String lastName) {
    return userRepository.getSearchUser(firstName, lastName);
  }

  public Integer insertUser(UserFromDatabase userFromDatabase){
    return userRepository.insertUser(userFromDatabase);
  }

}
