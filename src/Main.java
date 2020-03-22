import SpeciesPackage.Dragon;
import SpeciesPackage.Wargs;

import java.util.ArrayList;

/**
 * Project: [Proiect] The Lord Of Java
 * Author: mihai
 * Date: 3/21/2020
 */
public class Main {
    private static final String file = "The Lord of Java.app";

    public static void main(String[] args) {
        LordOfJava lordOfJava = new LordOfJava("Windows", file, "mihai.vlasceanu", 3);

        lordOfJava.addCreature(new Dragon(10, 10, 10, "Dragon1", 0, 5.5, 2), "132");
        lordOfJava.addCreature(new Dragon(20, 23, 5, "Dragon2", 34, 123.2, 5), "001");
        lordOfJava.addCreature(new Dragon(14, 6, 2, "Dragon3", 1, 12.1, 7), "202");
        lordOfJava.addCreature(new Dragon(11, 10, 25, "Dragon4", 12, 12.1, 7), "20132");

        lordOfJava.addCreature(new Wargs(23, 3, 11, "Warg1", 2, 12.1), "1231");
        lordOfJava.addCreature(new Wargs(6, 21, 12, "Warg2", 12, 2.1), "11231");
        lordOfJava.addCreature(new Wargs(12, 9, 5, "Warg3", 10, 10.2), "16231");
        lordOfJava.addCreature(new Wargs(11, 10, 23, "Warg4", 20, 9.9), "123145");

        System.out.println(lordOfJava);
        System.out.println();

        System.out.println("--- Fight time ---");
        int fightResult = lordOfJava.battleDragonsWargs();
        System.out.println(fightResult);
        if (fightResult > 0){
            System.out.println("Dragons win! The magnitude of the victory is: " + fightResult);
        }else if (fightResult < 0){
            System.out.println("Wargs win! The magnitude of the victory is: " + Math.abs(fightResult));
        }else {
            System.out.println("Draw");
        }
    }
}
