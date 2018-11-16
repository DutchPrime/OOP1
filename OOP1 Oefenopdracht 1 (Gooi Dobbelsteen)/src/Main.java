import java.util.function.DoubleBinaryOperator;

/**
 * Description:
 *
 *
 * @author Koen Lippe (500794493)
 */

public class Main {

    public static void main(String[] args) {
        Dobbelsteen steen = new Dobbelsteen();
        System.out.println(steen.getWorp());

        steen.gooi();
        steen.print();
    }
}
