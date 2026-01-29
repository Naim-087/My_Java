package java_folder;
import java.util.Scanner;
public class max_number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1= input.nextInt();
        System.out.println("Enter Sec Number : ");
        int num2 = input.nextInt();
        System.out.println("Enter Third Number : ");
        int num3 = input.nextInt();

        if(num1 > num2 && num2 > num3)
        {
            System.out.print("Greater Number : "+num1);
        }
        else if(num2 > num3 && num2 > num1)
        {
            System.out.print("Greater Number : "+num2);
        }
        else
        {
            System.out.println("Greater Number : "+num3);
        }


        input.close();
        
    }
    
}
