/**
 * Description here
 *
 * @author Koen Lippe 500794493
 */

public class Kofferslot {

    //Declaring
    private Letter[] letterlijst;
    private Cijfer cijfer;


    public Kofferslot(){
        this.letterlijst = new Letter[]{
          new Letter(),
          new Letter()
        };


        this.cijfer = new Cijfer();
    }

    public Kofferslot(char firstLetter, char secondLetter, int cijfer){
//        Verified
        this.letterlijst = new Letter[]{
                new Letter(firstLetter),
                new Letter()
        };

        letterlijst[0].setLetter(firstLetter);
        letterlijst[1].setLetter(secondLetter);

        this.cijfer = new Cijfer();

    }

    public void volgende(){
        if(cijfer.getCijfer() == 9){
            cijfer.volgende();

            if(letterlijst[0].getLetter() == 'Z' && letterlijst[1].getLetter() == 'Z'){
                letterlijst[0].volgende();
                letterlijst[1].volgende();
            }

            if(letterlijst[1].getLetter() == 'Z'){
                letterlijst[1].volgende();
                letterlijst[0].volgende();
            }

        }
    }


}

