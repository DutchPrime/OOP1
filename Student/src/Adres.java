/**
 * Deze klasse bevat informatie en methodes van een adres object
 *
 * @author  Koen Lippe 500794493
 */



public class Adres {
    //Variables
    private String straat;
    private int huisnr;
    private String postcode;
    private String plaats;

    //Constructor

    /**
     * This constructor creates an Adres instance
     * @param straat The street name of the address
     * @param huisnr The number of the address
     * @param postcode The postal code of the address
     * @param plaats In which city the address is located
     */
    public Adres(
            String straat,
            int huisnr,
            String postcode,
            String plaats)
    {
        this.straat = straat;
        this.huisnr = huisnr;
        this.postcode = postcode;
        this.plaats = plaats;
    }

    //Methods
    /**
     * This method returns the full adress in a formatted String
     *
     * @return formatted String (full address)
     */
    public String toString(){
        return straat + " " + huisnr + ", " + postcode + " " + plaats;
    }

    /**
     * This method checks if the entered postal code is in the correct format
     * The correct format is:
     *      1st number between 1 and 9
     *      2nd til 4th number between 0 and 9
     *      5th and 6th must be a letter
     *
     * @param postcode The postal code that needs to be checked
     * @return true or false statement that indicates if the postocal code is in the right format.
     */
    public static boolean checkPostcode (String postcode) {
        if(postcode.length() != 6){
            return false;
        }

        for (int i = 0; i < 6; i++) {
            int c = postcode.indexOf(i);
            switch (i){
                case 0:
                    //First number has to be between 1 and 9
                    if(c < 1) {
                        return false;
                    }
                    break;
                case 1:
                case 2:
                case 3:
                    //Number 2,3 and 4 must be between 0 and 9
                    if(!Character.isLetter(c)){
                        return false;
                    }
                    break;

                case 4:
                case 5:
                    if(Character.isAlphabetic(c)){
                        return false;
                    }
            }
        }

    return true;
    }
}
