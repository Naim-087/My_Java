package java_folder;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter number ");
        int fact = input.nextInt();

        
        int num=1;
        for(int i=1;i<=fact;i++)
        {
           num=num *i;
            
        }
        System.out.println(num);

        input.close();
    }
}
