import CreatePackage.Creature;
import SpeciesPackage.Dragon;
import SpeciesPackage.Mumakil;
import SpeciesPackage.Wargs;

import java.util.ArrayList;

/**
 * Project: [Proiect] The Lord Of Java
 * Author: mihai
 * Date: 3/21/2020
 */

/*
    In cadrul tinutului The Lord Of Java, exista mai multe specii de creaturi, care traiesc grupate pe specie, in asa-numitele hoarde.
 */

public class LordOfJava {
    private Parameters parameters;
    private Cohort<Dragon> dragonCohort = new Cohort<>();
    private Cohort<Wargs> wargsCohort = new Cohort<>();
    private Cohort<Mumakil> mumakilCohort = new Cohort<>();

    public LordOfJava(String OS, String gamePATH, String credentials, int noLives) {
        this.parameters = new Parameters(OS, gamePATH, credentials, noLives);
    }


    // Adauga o noua creatura, in functie de specia acesteia, la una dintre cele 3 hoarde
    public void addCreature(Creature creature, String address) throws NullPointerException{
        try {
            if (creature instanceof Dragon) {
                this.dragonCohort.addNewCitizen(address, (Dragon) creature);
            } else if (creature instanceof Wargs) {
                this.wargsCohort.addNewCitizen(address, (Wargs) creature);
            } else if (creature instanceof Mumakil) {
                this.mumakilCohort.addNewCitizen(address, (Mumakil) creature);
            } else {
                throw new IllegalArgumentException("Creature type unknown: " + creature.getClass().getName());
            }
        }catch (NullPointerException e){
            System.out.println(creature.getClass().getName() + " is null!");
        }
    }


    //Modeleaza un duel intre hoarda de dragoni si cea de wargi, intorcand ulterior rezultatul duelului
    public int battleDragonsWargs(){
        if (this.dragonCohort.size() > this.wargsCohort.size()){
            return (this.dragonCohort.size() - this.wargsCohort.size());
        }else if (this.dragonCohort.size() < this.wargsCohort.size()){
            return (this.dragonCohort.size() - this.wargsCohort.size());

        }

        ArrayList<Dragon> dragonsToFight = this.dragonCohort.getAllCitizensToFight();
        ArrayList<Wargs> wargsToFight = this.wargsCohort.getAllCitizensToFight();
        int finalScore = 0;

        for (int i = 0; i < wargsToFight.size(); i++){
            int fight = dragonsToFight.get(i).compareTo(wargsToFight.get(i));
            finalScore += Integer.compare(fight, 0);
        }
        return finalScore;
    }


    @Override
    public String toString() {
        return "Parameters: " + parameters +
                "\n\nDragonCohort:\n" + dragonCohort +
                "\nWargsCohort:\n" + wargsCohort +
                "\nMumakilCohort:\n" + mumakilCohort + '}';
    }
}
