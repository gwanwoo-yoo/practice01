package com.example.practice01.calc;

public class StoneDuck extends Duck{
  public StoneDuck(String name, Double weight) {
    super(name, weight);
  }

  @Override
  public void quack() {
    System.out.println("돌로만든 오리는 울수 없습니다.");
  }

  public void quack(int type) {
    if(type == 1){
      System.out.println("돌로만든 오리는 울수 없습니다.");
    }
    else {
      System.out.println("다른 타입의 오리입니다.");
    }
  }

}
