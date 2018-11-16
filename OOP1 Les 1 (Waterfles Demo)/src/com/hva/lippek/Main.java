package com.hva.lippek;

import java.time.LocalDate;
import java.util.Random;

/***
 * @author Koen Lippe (500794493)
 * Beschrijving
 */
public class Main {

    public static void main(String[] args) {
        //Waterfles
        Waterfles wf1 = new Waterfles(20,10);
        wf1.kleur = "rood";
        wf1.drink(1);
        wf1.bekijk();

        Waterfles wf2 = new Waterfles(10, 5);
        wf2.kleur = "groen";
        wf2.drink(2);
        wf2.bekijk();

        Waterfles wf3 = new Waterfles(30,25);
        wf3.kleur = "blauw";
        wf3.drink(5);
        wf3.bekijk();

        //Random
        Random random = new Random();
        random.nextInt(100);

        //LocalDate
        LocalDate vandaag = LocalDate.now();
        System.out.println("Vandaag is het: " + vandaag);


        //--------
        String huiswerk = "Quiz week 1 + VLO checken voor wekelijkse huiswerk";

    }
}
