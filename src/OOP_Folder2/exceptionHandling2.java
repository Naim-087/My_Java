package OOP_Folder2;
import java.util.*;

    class AgeException extends Exception {
    public AgeException(String message) {
        super(message);  // sends message to parent
    }
    }

public class exceptionHandling2 {
    public static void main(String[] args) {

        try {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your child age : ");
         int age = sc.nextInt();

        
         
        if(age<=18){
                throw new AgeException("Your Child is underage");
            }
            else{
                System.out.println("You Child is eligible");
            }
           

        } catch (AgeException e) {
            System.out.println(e.getMessage());
            
        }
      
    }
}
    

