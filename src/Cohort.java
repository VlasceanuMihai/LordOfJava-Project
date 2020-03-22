import CreatePackage.Creature;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Project: [Proiect] The Lord Of Java
 * Author: mihai
 * Date: 3/21/2020
 */

/*
    Fiecare specie de animal fantastic va fi asociat unei hoarde. In alta ordine de idei, fiecare hoarda va stoca
    un singur tip de animal, dat de parametrul de tip.
 */

public class Cohort<C extends Creature> {
    private Map<String, C> citizens = new HashMap<>();


    // Metode specifice colectiei Map
    // returneaza numarul total de creaturi din hoarda
    public int size(){
        return this.citizens.size();
    }


    // returneaza creatura aflata la adresa address
    public C getCitizenAt(String address){
        return this.citizens.get(address);
    }


    // returneaza true daca container-ul este go
    public boolean isEmpty(){
        return this.citizens.isEmpty();
    }


    // Metode specifice unei colonii de creaturi
    // va adauga un nou element hoardei, adica o creatura noua la o anumita adresa.
    public void addNewCitizen(String address, C creature){
        this.citizens.put(address, creature);
    }


    // se sorteaza crescator, de la cei mai slabi la cei mai puternici indivizi
    // metoda va returna un vector sortat, ce contine toate creaturile hoardei respective in ordine crescatoare.
    public ArrayList<C> getAllCitizensToFight(){
        ArrayList<C> hoard = new ArrayList<>(this.citizens.values());
        Collections.sort(hoard);
        return hoard;
    }


    @Override
    public String toString() {
        ArrayList<C> sortedCitizens = this.getAllCitizensToFight();
        StringBuilder result = new StringBuilder();

        for (C creature : sortedCitizens){
            result.append(creature).append("\n\n");
        }
        return result.toString();
    }
}
