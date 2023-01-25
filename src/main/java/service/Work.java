package service;


import pojo.Human;

public class Work {
    public void rise(Human human, int riseAmount) {

        human.salary += riseAmount;
        System.out.println(human.name + " " + human.lastname + "got rise and now earns:" + human.salary);


    }

    public void reduction(Human human, int a) {
        int reductionAmount = a;

        human.salary = human.salary - reductionAmount;
        System.out.println(human.name + human.lastname + "got fucked and now earns:" + human.salary);

    }
}