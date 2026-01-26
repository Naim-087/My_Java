package java_folder;
import java.util.Scanner; // import input package 
public class input1 {
    public static void main(String[] args)
    {
          Scanner naim = new Scanner(System.in); // create new scanner objevt 

          System.out.println("Enter your name : ");
          String name = naim.nextLine(); //object.nextline() for string 

          System.out.println("My name is : "+name); // print output 

          naim.close(); // clode object
    }
}


