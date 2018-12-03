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
    public String toString(){
        return null;
    }

    public static boolean checkPostcode (String postcode){
        return false;
    }





}
