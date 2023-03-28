package com.owl.edu.vn.lolchampion;

public interface IHero {
    public void setName(String name);
    public void setRole(String role);
    public IHero setAttackDamage(IHero hero);
    public void setAbilityPower(int abilityPower);
    public void setHealthPoints(int healthPoints);
    public int getHealthPoints();
    public void setManaPoints(int manaPoints);
    public int getManaPoints();
    public void ultimateAbility(int level, IHero hero);

    public void displayStats();
}
