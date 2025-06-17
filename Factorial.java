// 17-06-2025
import java.util.Scanner;

public class Factorial {
    public static int findfactof(int n){
        for (int i = n - 1 ; i >= 1 ; i--) {
            n = n * i; // Calculate factorial
        }
        return n ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
         // Prompt user for input
        int num = sc.nextInt();
        sc.close();

        if (num<0) {
            System.out.println("Factorial is not defined for negative numbers.");

        } else if (num == 0  || num == 1) {
            System.out.println("Factorial of the number + " + num);
        } else {
            System.out.println("Factorial of the number = "+ findfactof(num));
        }
    }

    
}
