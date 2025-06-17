//Add two numbers by using functions in Java
public class function {
    
    //function definition
    public static int adding(int a, int b, int c) {
        return a + b + c;
    }

    //calling the function
    public static void main(String[] args) {

        int sum=adding(23,90, 65); //function call
        System.out.println("The sum is: " + sum);
    }
}
