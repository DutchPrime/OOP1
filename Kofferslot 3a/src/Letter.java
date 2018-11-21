/**
 * Beschrijving:
 *
 * @author Koen Lippe 500794493
 */

public class Letter {
    private char letter;

    public Letter() {
        this.letter = 'A';
    }

    public char getLetter(){
        return this.letter;
    }

    public void setLetter(char letter){
        this.letter = letter;
    }

    public void volgende(){
        if(this.letter == 'Z'){
            this.letter = 'A';
        }
        else {
            this.letter++;
        }
    }

}
