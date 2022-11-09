package com.example.practice01.user.model;

import lombok.Data;

@Data
public class UserFromDatabase {
  private String firstName;
  private String lastName;
  private String email;
}
