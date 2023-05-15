package com.example.polymorphism_exercise;

 class Warrior extends Person {

    public Weapon weapon;

    public Warrior(String name) {
        super(name);
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    public void decHealth(int amt){
        health = Math.max(0, health - amt);

        
    }

    public void attack(Warrior opponent)
    {

        opponent.decHealth(2);

        if(health > 0 && opponent.health > 0)
        {
           if(weapon != null)
           {
            System.out.println(name + " is attaking " + opponent.name);
            System.out.println(opponent.name + " " + opponent.health);
           }

        }
    }
    

}
