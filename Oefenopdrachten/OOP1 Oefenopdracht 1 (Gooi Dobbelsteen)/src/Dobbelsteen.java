import java.util.Random;

/**
 * Description: This is the dobbelsteen class which defines the way a dobbelsteen acts.
 *
 * @author Koen Lippe (500794493)
 */

public class Dobbelsteen {
    public int worp;
    Random getalGenerator = new Random();
    public char karakter = '*';


    public void gooi(){
        this.worp = getalGenerator.nextInt(6) + 1;


    }

    public void print(){
        switch (this.worp){
            case 6:
                for (int i=0; i<3; i++){
                    System.out.printf("%s  %s  %s%n", karakter, karakter, karakter);
                }
                System.out.println();
                break;
            case 5:
                System.out.printf("%s     %s%n", karakter, karakter);
                System.out.printf("   %s%n", karakter);
                System.out.printf("%s     %s%n", karakter, karakter);
                System.out.println();
                break;
            case 4:
                System.out.printf("%s     %s%n", karakter, karakter);
                System.out.println("");
                System.out.printf("%s     %s%n", karakter, karakter);
                System.out.println();
                break;
            case 3:
                System.out.printf("%s%n", karakter);
                System.out.printf("   %s%n", karakter);
                System.out.printf("      %s%n", karakter);
                System.out.println();
                break;
            case 2:
                System.out.printf("%s%n", karakter);
                System.out.println();
                System.out.printf("      %s%n", karakter);
                System.out.println();
                break;
            case 1:
                System.out.println();
                System.out.printf("   %s%n", karakter);
                System.out.println();
                System.out.println();
                break;

        }
    }

    public int getWorp(){
        return this.worp;
    }
}
