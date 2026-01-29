package java_folder;
import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        if(number%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("Odd number");
        }
        input.close();

       
    }
}
