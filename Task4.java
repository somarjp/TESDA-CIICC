import java.util.Scanner;

public class Task4 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();
        StringBuilder back = new StringBuilder(word);
        String palindrome = back.reverse().toString();
        if(word.equals(palindrome)){
            System.out.println("The input string is a palindrome");
        }else{
            System.out.println("The input string is not a palindrome");
        }




    }
}