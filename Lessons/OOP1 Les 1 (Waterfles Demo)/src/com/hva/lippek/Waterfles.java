/***
 * @author Koen Lippe (500794493)
 * Beschrijving:
 */

package com.hva.lippek;

public class Waterfles {
    public String kleur;
    public int inhoud;
    public int maximaleInhoud;

//    //Constructor
//    public Waterfles(){
//        kleur = "doorzichtig";
//        maximaleInhoud = 10;
//        inhoud = 10;
//    }

    public Waterfles(int maximaleInhoud, int inhoud){
        this.kleur = "doorzichtig";
        this.maximaleInhoud = maximaleInhoud;
        this.inhoud = inhoud;
    }

    public void drink(int hoeveelheid) {
        inhoud -= hoeveelheid;
    }
    public void vul(int hoeveelheid){
        inhoud += hoeveelheid;
    }

    public void bekijk(){
        System.out.printf("De fles is %s van kleur en is voor %d/%d gevuld.%n", kleur, inhoud, maximaleInhoud);
    }

}
