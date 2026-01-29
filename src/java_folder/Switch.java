package java_folder;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number from 1 to 4 ");
        int digit= input.nextInt();

        switch (digit) 
        {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;
        
            default:
               
                System.out.println("The number is greater than 4 ");
             
        }
        input.close();
        
    }
}


