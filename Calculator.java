// 17-06-2025
public class Calculator {
    public static int addnum( int a, int b){
        return a + b; //Addition
    }
    public static int subnum( int a, int b){
        return a - b;//Subtraction
    }
    public static int mulnum( int a, int b){
        return a * b; //Multiplication
    }
    public static int divnum( int a, int b){
        return a / b; //Division
    }
    public static void main(String[] args){
        int sum = addnum(18, 7);
        int diff = subnum(18, 7);
        int prod = mulnum(18, 7);  
        int quot = divnum(18, 7);
        System.out.println("The numbers are {a} and {b}");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quot);
    }
}
