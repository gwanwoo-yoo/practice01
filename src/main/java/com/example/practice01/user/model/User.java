package com.example.practice01.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class User {
  public Integer id;
  private String name;
  private Date joinDate;

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

}