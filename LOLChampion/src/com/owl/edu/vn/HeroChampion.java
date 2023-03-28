package com.owl.edu.vn;

abstract class HeroChampion {

    protected String name;
    protected String role;
    protected int attackDamage;
    protected int abilityPower;
    protected int healthPoints;
    protected int manaPoints;

    public HeroChampion(String name, String role, int attackDamage, int abilityPower, int healthPoints, int manaPoints) {
        this.name = name;
        this.role = role;
        this.attackDamage = attackDamage;
        this.abilityPower = abilityPower;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
    }

    public void displayStart(){
        System.out.println("name: " + this.name);
        System.out.println("role: " + this.role);
        System.out.println("attackDamage: " + this.attackDamage);
        System.out.println("abilityPower: " + this.abilityPower);
        System.out.println("healthPoints: " + this.healthPoints);
        System.out.println("manaPoints: " + this.manaPoints);
        System.out.println("");
    }

}
