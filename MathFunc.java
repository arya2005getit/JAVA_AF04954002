public class MathFunc{
    public static void main(String[] args) {
        double number = 25.0;

        // Square root
        double sqrt = Math.sqrt(number);
        System.out.println("Square root of " + number + " is " + sqrt);

        // Power
        double power = Math.pow(number, 3);
        System.out.println(number + " raised to the power 3 is " + power);

        // Sine
        double radians = Math.toRadians(90);
        double sine = Math.sin(radians);
        System.out.println("Sine of 90 degrees is " + sine);

        // Absolute value
        double negative = -6.7;
        double absValue = Math.abs(negative);
        System.out.println("Absolute value of " + negative + " is " + absValue);

        // Maximum
        double max = Math.max(8, 9);
        System.out.println("Maximum of 8 and 9 is " + max);
    }
}
