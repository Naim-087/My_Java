package java_folder;

import java.util.Scanner;

public class Get_input {
    
     public static void main(String[] args) {
      
        Scanner input = new Scanner (System.in);
        int number2 ;
        System.out.println("Enter any number : ");
        number2 = input.nextInt();
        System.out.println(number2);

       input.nextLine(); // 🔥 buffer clear

        String name ;
        System.out.println("Enter a your name : ");
        name = input.nextLine();
        System.out.println(name);
        
        
        input.close();
     }
}
