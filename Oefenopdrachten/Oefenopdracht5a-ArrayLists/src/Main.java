import java.util.ArrayList;
import java.util.Collections;

/**
 * Practicing with ArrayLists
 *
 * @author Koen Lippe (500794493)
 */

public class Main {

    public static void main(String[] args) {
        //1. Maak een lijst van het type ArrayList waarin alleen gehele getallen kunnen worden opgeslagen.
        ArrayList<Integer> arrayList = new ArrayList<>();

        //2. Voeg het getal 17 toe aan de lijst
        arrayList.add(17);
        print(arrayList);

        //3. Voeg het getal 3 toe aan het einde van de lijst
        arrayList.add(arrayList.size(), 3);
        print(arrayList);

        //4. Voeg het getal 12 toe aan het begin van de lijst
        arrayList.add(0, 12);
        print(arrayList);

        //5. Voeg het getal -8 toe op de tweede positie van de lijst
        arrayList.add(1, -8);
        print(arrayList);

        //6. Voeg 5x het getal 20 toe op de vierde positie van de lijst
        arrayList.add(3,20);
        arrayList.add(3,20);
        arrayList.add(3,20);
        arrayList.add(3,20);
        arrayList.add(3,20);
        print(arrayList);

        //7. Print de hele lijst
        print(arrayList);

        //8. Print het aantal getallen in de lijst
        System.out.println(arrayList.size());

        //9. Print het laatste getal van de lijst
        System.out.println(arrayList.get(arrayList.size()-1));

        //10. Wijzig het derde getal in de lijst naar -5
        arrayList.set(2, -5);
        print(arrayList);

        //11. Verwijder het een na laatste getal in de lijst
        arrayList.remove(arrayList.size()-2);
        print(arrayList);

        //12. Wijzig het derde getal in de lijst in zijn absolute waarde
        arrayList.set(2, 5);
        print(arrayList);

        //13. Verwijder het 5e getal uit de lijst
        arrayList.remove(4);
        print(arrayList);

        //14. Verwijder het getal 5 uit de lijst
        arrayList.remove(arrayList.indexOf(5));
        print(arrayList);

        //15. Verwijder alle getallen 20 uit de lijst
        ArrayList<Integer> toRemove = new ArrayList<>();

        for(int nummer : arrayList){
            if(nummer == 20){
                toRemove.add(arrayList.indexOf(nummer));
            }
        }

        for (int nummer : toRemove){
            arrayList.remove(nummer);
        }

        print(arrayList);

        //16. Print het grootste getal in de lijst uit
        System.out.println(Collections.max(arrayList));

        //17. Sorteer de lijst
        Collections.sort(arrayList);
        print(arrayList);

        //18. Schud de lijst door elkaar
        Collections.shuffle(arrayList);
        print(arrayList);
    }

    private static void print(ArrayList list){
        for (Object nummer : list) {
            System.out.printf("%d ", nummer);
        }
        System.out.println();
    }
}
