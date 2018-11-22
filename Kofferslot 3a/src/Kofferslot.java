/**
 * Description here
 *
 * @author Koen Lippe 500794493
 */

public class Kofferslot {
    private Letter letterlijst[];
    private Cijfer cijfer[];

    public Kofferslot(){
        Letter letterlijst[] = {};
        letterlijst[0] = new Letter();
        letterlijst[1] = new Letter();

        Cijfer cijfer = new Cijfer();
    }

    public Kofferslot(char firstLetter, char secondLetter, int cijfer){
        Letter letterlijst[] = {};
        letterlijst[0] = new Letter();
        letterlijst[1] = new Letter();

        letterlijst[0].setLetter(firstLetter);
        letterlijst[1].setLetter(secondLetter);

        Cijfer cijfer1 = new Cijfer();
        cijfer1.setCijfer(cijfer);
    }

/////////////////////////////////////////////////////// USE .volgende() not finished ///////////////////////////////////////////////////////
    public void volgende(){
        //Number is not 9 yet so increase number
        if(this.cijfer[0].getCijfer() < 9){
            this.cijfer[0].volgende();
        }
        //Number = 9 so increase some letters.
        else if(this.cijfer[0].getCijfer() == 9){

            

        }

    }
}
