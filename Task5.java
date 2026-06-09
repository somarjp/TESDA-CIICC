import java.util.*;

public class Task5 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        String[] enter = {"first", "second", "third"};
        int[] number = new int[3];

        for(int i=0; i<3; i++){
            System.out.print("Enter the "+enter[i]+" number: ");
            number[i] = input.nextInt();
        }
        Arrays.sort(number);
        if (number[0] == number[1] && number[1] == number[2]){
            System.out.println("All numbers are equal");
        }else {
            System.out.println("Largest number: "+number[2]);

        }
    }
}
