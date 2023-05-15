package com.example.polymorphism_exercise;
 class Person {

String name;
int health = 100;

    public Person(String name){

        this.name = name;


    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

}
