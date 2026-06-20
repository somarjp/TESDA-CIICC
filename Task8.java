import java.util.*;
public class Task8 {

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of inputs: ");
        int total = input.nextInt();

        int[] num = new int[total];

        for (int i=0; i<total; i++){
            System.out.printf("Enter the number(%d): ", i);
            num[i] = input.nextInt();
        }
        
        Task8 sum = new Task8();

        System.out.println("Total sum of all parameters: "+sum.varSum(num));


    }

    public int varSum(int...num){
        int total = num.length, totalSum=0;

        for(int x=0; x<total; x++){
            int sum = 0;
            for(int y=0; y<=num[x]; y++){
                sum+=y;
            }
            System.out.println("Total sum of parameter ("+x+"): "+sum);
            totalSum +=sum;
        }
        return totalSum;
    }
}