package com.example.practice01;

import com.example.practice01.calc.Duck;
import com.example.practice01.user.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Practice01ApplicationTests {

  @Test
  void contextLoads() {
  }

  @Test
  void duckTest(){
    Duck duck = new Duck("Donald", 2.0);
    Duck duck1 = new Duck("Donald", 0.8);
    Duck duck2 = new Duck("Donald", 2.0);
    Duck duck3 = new Duck("Donald", 3.0);
    Duck duck4 = new Duck("Donald", 2.0);
    Duck duck5 = new Duck("Donald", 1.0);

    System.out.println(duck.estimateDuck());
    System.out.println(duck1.estimateDuck());
    System.out.println(duck2.estimateDuck());
    System.out.println(duck3.estimateDuck());
    System.out.println(duck4.estimateDuck());
    System.out.println(duck5.estimateDuck());

  }
}

