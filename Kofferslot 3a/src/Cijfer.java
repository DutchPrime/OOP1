/**
 * Beschrijving hier
 *
 * @author  Koen Lippe 500794493
 */
public class Cijfer {
    private int cijfer;

    public Cijfer(){
        this.cijfer = 0;
    }

    public int getCijfer() {
        return this.cijfer;
    }

    public void setCijfer(int cijfer) {
        this.cijfer = cijfer;
    }

    public void volgende(){
        if(this.cijfer < 9){
            this.cijfer++;
        }
        else{
            this.cijfer = 0;
        }
    }
}
