package com.example.polymorphism_exercise;
class Sword implements Weapon {
    public void strike(Warrior opponent) {
        System.out.println("Slashing " + opponent.getName());
        opponent.decHealth(5);
        // etc.
    }

    @Override
    public void strike(Weapon opponent) {
        
    }
}

class Wand implements Weapon {
    public void strike(Warrior opponent) {
        System.out.println("Mesmerizing " + opponent.getName());
        opponent.decHealth(3);
        // etc.
    }

    @Override
    public void strike(Weapon opponent) {
       
    }
}

class Whip implements Weapon {
    public void strike(Warrior opponent) {
        System.out.println("Snapping " + opponent.getName());
        opponent.decHealth(4);
        // etc.
    }

    @Override
    public void strike(Weapon opponent) {
       
    }
}
