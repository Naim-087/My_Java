package OOP_Folder2;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_list_input {
    public static void main(String[] args) {
        ArrayList<String>Name = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);

        System.out.print("Entera Array size : ");
         int size = input.nextInt();
         input.nextLine();
        System.out.println("Enter Name : ");
         for(int i = 0; i<size;i++){
          
           String name = input.nextLine();
            Name.add(name);
         }

         for(int i=0;i<size;i++){
            System.out.println(Name.get(i));
         }
    }
    
}
