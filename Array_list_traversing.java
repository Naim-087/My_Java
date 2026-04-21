package OOP_Folder;
import java.util.*;

public class Array_list_traversing {
        public static void main(String[] args) {
        
        ArrayList<String> City = new ArrayList<>();

       
        Scanner input = new Scanner(System.in);

         System.out.print("How many cities: ");
        int n = input.nextInt();
        input.nextLine(); // clear buffer


        for(int i =0 ; i< n; i++){

            System.out.println("Enter your City : ");
            
            String c = input.nextLine();
            City.add(c);

            System.out.println(City.get(i));
           

        }

        
    }
}
