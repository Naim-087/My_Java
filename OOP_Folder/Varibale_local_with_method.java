package OOP_Folder;

import java.util.Scanner;

public class Varibale_local_with_method {

     void Show()
    {
        Scanner input = new Scanner(System.in);
        int age ; // Local variable
        String name ;// Local variable

        System.out.print("Enter your age : ");
        age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your name : ");
        name = input.nextLine();
       
        System.out.println("my name is : "+name);
        System.out.println("my age is : "+age);
        input.close();

 }

    public static void main(String[] args) {
        // Creating object to call a method 
    Varibale_local_with_method var = new Varibale_local_with_method();

    var.Show();


    }
    
}
