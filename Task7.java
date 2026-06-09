import java.util.Scanner;

public class  Task7{
    public double addNum(double num1, double num2){
        double sum = num1+num2;
        System.out.print("Sum: ");
        return sum;
    }

    public double subtractNum(double num1, double num2){
        double diff  = num1 - num2;
        System.out.print("Difference: ");
        return diff;
    }

    public double multiplyNum(double num1, double num2){
        double prod = num1 * num2;
        System.out.print("Product: ");
        return prod;
    }

    public double divideNum(double num1, double num2){
        double quo = num1 / num2;
        System.out.print("Quotient: ");
        return quo;
    }

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        Task7 calculator = new Task7(num1, num2);

        System.out.println(calculator.addNum(num1, num2));
        System.out.println(calculator.subtractNum(num1, num2));
        System.out.println(calculator.multiplyNum(num1, num2));
        System.out.println(calculator.divideNum(num1, num2));

    }


    public Task7(double num1, double num2){

    }
}

