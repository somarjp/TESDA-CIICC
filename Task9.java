import static java.lang.Math.*;
import java.util.Scanner;

public class Task9{

    public static int add(int a, int b){
        int sum = Math.addExact(a,b);
        return sum;
    }

    public static int subtract(int a, int b){
        int diff = Math.subtractExact(a,b);
        return diff;
    }

    public static int multiply(int a, int b){
        int prod = Math.multiplyExact(a,b);
        return prod;
    }

    public static float divide(int a, int b){
        int quo = Math.divideExact(a,b);
        return quo;
    }

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();

        System.out.print("Enter the second number: ");
        int b = input.nextInt();


        System.out.println("Sum: "+add(a,b));
        System.out.println("Difference: "+subtract(a,b));
        System.out.println("Product: "+multiply(a,b));
        System.out.println("Quotient: "+divide(a,b));
    }
}