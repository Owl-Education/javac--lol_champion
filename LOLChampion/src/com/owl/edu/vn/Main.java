package com.owl.edu.vn;

import com.owl.edu.vn.lolchampion.IHero;

public class Main {

    public static void main(String[] args) {
        IHero lux = new Lux("Lux", "Magic", 270, 380, 350, 380);
        lux.displayStats();

        IHero garen = new Garen("Garen", "Tank", 450, 380, 560, 270);
        garen.displayStats();

        System.out.println("Lux attack Garen");
        garen = lux.setAttackDamage(garen);
        garen.displayStats();

        System.out.println("Garen attack Lux");
        lux = garen.setAttackDamage(lux);
        lux.displayStats();
    }
}
