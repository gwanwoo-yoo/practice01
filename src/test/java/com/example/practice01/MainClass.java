package com.example.practice01;

import com.example.practice01.calc.StoneDuck;

public class MainClass {
  public static void main(String args[]){
    StoneDuck stoneDuck = new StoneDuck("Donald", 20.0);
    stoneDuck.quack();
    stoneDuck.quack(1);
    stoneDuck.quack(2);
  }

}
