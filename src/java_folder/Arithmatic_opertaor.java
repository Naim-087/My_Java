package java_folder;

 import java.util.Scanner ;
public class Arithmatic_opertaor {
    static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        int num1,num2;
        System.out.print("Enter  first Number : ");
        num1= input.nextInt();

        System.out.print("Enter second number :");
        num2= input.nextInt();

        int sum = num1+num2;
        int subtraction = num1-num2;
        float division = num1/num2;
        int reminder = num1%num2;

        System.out.println("Sum = "+ sum);
        System.out.println("Subtraction = "+ subtraction);
        System.out.println("Division = "+ division);
        System.out.println("Reminder = "+reminder);

      input.close();
    }
}
