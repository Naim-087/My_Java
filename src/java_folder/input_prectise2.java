package java_folder;
import java.util.Scanner;

public class input_prectise2 {
    static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Product Id : ");
        int id = input.nextInt();
        
        input.nextLine(); // For next line buffer int & string 
        System.out.println("Enter Product Title : ");
        String title = input.nextLine();

        System.out.println("Enter Product price  : ");
        double price = input.nextDouble();

        input.nextLine();
        System.out.println("Enter Product Description : ");
        String description = input.nextLine();

        System.out.println("Enter Product Category : ");
        String catg = input.nextLine();


        System.out.println("Prodcut Id : "+id);
        System.out.println("Product Title : "+title);
        System.out.println("Product price : "+price);
        System.out.println("Product Desc : "+description);
        System.out.println("Product Category : "+catg);

        input.close();


    }
}



