package java_folder;
import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = input.nextInt();
        
        if((year % 4==0) || (year % 100==0) || (year % 400==0))
        {
            System.out.println("Yes! Leap Year");
        }
        else
        {
            System.out.println(" No! Leap Year");
        }
        input.close();
    }
}

