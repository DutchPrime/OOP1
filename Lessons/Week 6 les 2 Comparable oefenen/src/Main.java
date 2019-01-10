import modules.Kat;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Koen Lippe 500794993
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Kat> kattenLijst = new ArrayList<Kat>();
        kattenLijst.add(new Kat("Jesse", 15));
        kattenLijst.add(new Kat("Jimmy", 14));
        kattenLijst.add(new Kat("Julian", 10));
        kattenLijst.add(new Kat("Leah", 8));
        kattenLijst.add(new Kat("Katie", 4));
        kattenLijst.add(new Kat("Jesse", 16));
        kattenLijst.add(new Kat("Koen", 7));
        kattenLijst.add(new Kat("Yan", 9));
        kattenLijst.add(new Kat("Rick", 0));

        Collections.sort(kattenLijst);

        for(Kat kat : kattenLijst){
            System.out.println(kat.toString());
        }
    }
}
