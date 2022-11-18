package com.example.practice01.calc;

public class Duck {
    private String name;
    private Double weight;

    public Duck(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return String.valueOf(weight) + "ton";
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }


    public void quack(){
        System.out.println("꽊꽊");
    }

    public void swimming(){
        System.out.println("오리가 수영을 합니다");
    }

    public void speak(){
        System.out.println(this.name);
        this.quack();
    }

    public String estimateDuck(){
        String result = "";
        if(this.weight < 1){
            result = "빈약";
        }
        else if(this.weight >= 1 && this.weight < 2){
            result = "보통";
        }
        else if(this.weight >= 3){
            result = "튼튼";
        }
        return result;
    }

}
