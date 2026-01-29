package java_folder;
import java.util.Scanner;
public class SwithAtmProject 
{
   
    public static void main(String[] args) 
    {

     Scanner input = new Scanner (System.in);

     int balance = 20000;
     int pin ;
    
     System.out.println("Enter your pin 12345 : ");
      pin = input.nextInt();

     if(pin!=12345)
     {
        System.out.println("Error , Try again ! ");
        input.close();
        return;
     }
       
      int choice;

     do {
        
         System.out.println("\n===== ATM MENU =====");
         System.out.println("1.Check Balance");
         System.out.println("2.Deposite Money");
         System.out.println("3.Withdraw Money");
         System.out.println("4.Change Pin");
         System.out.println("5.Exit");

          choice = input.nextInt();
          //int  present_balance;

         switch (choice) 
           {
             case 1:
                 System.out.println("Your current balance :"+balance);
                 break;
             case 2:
                int deposite ;
                System.out.println("Enter deposite amount : ");
                deposite = input.nextInt();
                 balance = balance+ deposite;
                System.out.println("Current Balance : "+balance+"\n Deposite Successfull ");
                break;

             case 3:
              int withdraw;
              System.out.println("Enter withdrawing amount :");
              withdraw = input.nextInt();
              if(withdraw>0 && withdraw <=balance)
                {
                    balance-=withdraw;
                    System.out.print("Your Balance after withdrawing : "+balance);

                }
                else
                {
                    System.out.print("Insuffiecinet Balance !");
                }
                break;

             case 4:

                
                System.out.print("Enter new pin :");
                pin=input.nextInt();
                System.out.print("Pin Changed Successfully !");

             default:
                System.out.println("Invalid options , Try again !");

        
            }

     
        }while (choice!=5);

        input.close();
        
    }

}