import java.util.Scanner ;
public class FactRec {
    public static int findfactof(int n) {
        if(n == 0 || n == 1) {
            return 1 ;
        } else { 
            return n * findfactof(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        
        int num = sc.nextInt() ;
        sc.close();
        System.out.println("Fact of the number = "  + findfactof(num));
    }
}
