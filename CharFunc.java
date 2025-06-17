import java.lang.Character;
public class CharFunc {
    public static void main(String[] args){
        boolean a= Character.isDigit('6');
        System.out.println("Is '6' a digit? > " + a);
        boolean b= Character.isLetter('A');
        System.out.println("Is 'A' a letter? > " + b);
        boolean c= Character.isLetterOrDigit('A');
        System.out.println("Is 'A' a letter or digit? > " + c);
    }
}