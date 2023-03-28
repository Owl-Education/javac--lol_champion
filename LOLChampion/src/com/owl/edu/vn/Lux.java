package com.owl.edu.vn;

import com.owl.edu.vn.lolchampion.IHero;
import com.owl.edu.vn.lolchampion.IMagic;

public class Lux extends HeroChampion implements IHero, IMagic {

    public Lux(String name, String role, int attackDamage, int abilityPower, int healthPoints, int manaPoints) {
        super(name, role, attackDamage, abilityPower, healthPoints, manaPoints);
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setRole(String role) {

    }

    @Override
    public IHero setAttackDamage(IHero hero) {
        hero.setHealthPoints(hero.getHealthPoints() - this.attackDamage);
        return hero;
    }

    @Override
    public void setAbilityPower(int abilityPower) {

    }

    @Override
    public void setHealthPoints(int healthPoints) {

    }

    @Override
    public int getHealthPoints() {
        return this.healthPoints;
    }

    @Override
    public void setManaPoints(int manaPoints) {

    }

    @Override
    public int getManaPoints() {
        return 0;
    }

    @Override
    public void ultimateAbility(int level, IHero hero) {

    }

    @Override
    public void displayStats() {
        super.displayStart();
    }

    @Override
    public void spell(int level) {

    }
}
