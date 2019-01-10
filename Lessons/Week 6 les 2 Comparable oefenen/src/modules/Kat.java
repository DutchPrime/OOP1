package modules;

/**
 *  This class is used to practice the ovveride of compareTo()
 *
 * @author  Koen Lippe 500794493
 */
public class Kat implements Comparable<Kat>{
    private String naam;
    private int age;

    public Kat(String naam, int age){
        this.naam = naam;
        this.age = age;
    }

    public String getNaam() {
        return naam;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Kat kat) {
        int nameCompare = naam.compareTo(kat.getNaam());
        if(nameCompare == 0){
            return age - kat.getAge();
        }
        else {
            return nameCompare;
        }

    }

    @Override
    public String toString() {
        return String.format("%s (%d)", naam, age);
    }
}
