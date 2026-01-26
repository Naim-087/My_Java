package java_folder;
import java.util.Scanner;
public class ArithmaticTraingle {
    static void main(String[] args)
    {
         
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Base : ");
         double base= input.nextDouble();

        System.out.println("Enter Height :");
         double height = input.nextDouble();

        double area = (0.5 *base*height);

        System.out.print("Area of a trinagle  = "+area);
        input.close();
    }
}


