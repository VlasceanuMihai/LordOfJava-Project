package SpeciesPackage;

import CreatePackage.Creature;

/**
 * Project: [Proiect] The Lord Of Java
 * Author: mihai
 * Date: 3/21/2020
 */

interface IBite{
    //get bite power
    double getBitPower();
}


public class Wargs extends Creature implements IBite{
    private double bitePower;

    public Wargs(double stamina, double speed, int agility, String nickname, long score, double bitePower) {
        super(stamina, speed, agility, nickname, score);
        this.bitePower = bitePower; //Puterea muscaturii unei creaturi din aceasta specie, in duel
    }


    @Override
    public double getBitPower() {
        return this.bitePower;
    }


    @Override
    public void powerUp(double newStamina, double newSpeed, int newAgility) {
        super.powerUp(newStamina / 2, 4 * newSpeed, newAgility);
    }


    @Override
    public String toString() {
        return super.toString() + "\nBite Power: " + this.bitePower;
    }
}
