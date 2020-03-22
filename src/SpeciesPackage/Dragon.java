package SpeciesPackage;

import CreatePackage.Creature;

/**
 * Project: [Proiect] The Lord Of Java
 * Author: mihai
 * Date: 3/21/2020
 */

interface IBurn {
    // get flames power
    double getFlamesPower();

    // get flying speed
    int getFlyingSpeed();
}

public class Dragon extends Creature implements IBurn{
    private double flamesPower; // Puterea flacarilor aruncate, in duel
    private int flySpeed; // Viteza de zbor, exprimata in kilometri pe minut

    public Dragon(double stamina, double speed, int agility, String nickname, long score, double flamesPower, int flySpeed) {
        super(stamina, speed, agility, nickname, score);
        this.flamesPower = flamesPower;
        this.flySpeed = flySpeed;
    }


    @Override
    public double getFlamesPower() {
        return this.flamesPower;
    }


    @Override
    public int getFlyingSpeed() {
        return this.flySpeed;
    }


    @Override
    public void powerUp(double newStamina, double newSpeed, int newAgility){
        super.powerUp(2 * newStamina, (newSpeed / 2), 3 * newAgility);
    }


    @Override
    public String toString() {
        return super.toString() + "\nFlames power: " + this.flamesPower +
                "\nFly speed: " + this.flySpeed;
    }
}
