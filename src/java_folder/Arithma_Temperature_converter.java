package java_folder;
import java.util.Scanner;
public class Arithma_Temperature_converter {
    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Celcious Temperature : ");
    float celc = input.nextFloat();
    float farh = ((9/5)*celc + 32);
    System.out.println("Farenhite conversion : "+farh);
    
    System.out.print("Enter Farenhite temperaute : ");
    float farenh = input.nextFloat();
    float cel = ((5*farenh-32)/9);
    System.out.println("Celcius conversion : "+cel);
    input.close();


  }
}


