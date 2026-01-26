package java_folder;
import java.util.Scanner;
public class if_else_simple_project 
{
    public static void main(String[] args) 
    {
  
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter Patient name  : ");
        String name = input.nextLine();

        System.out.print("Enter patient age : ");
        int age = input.nextInt();
        
        System.out.println();
        System.out.print("Emergency Level : 1 → Critical\n 2 → Serious \n 3 → Normal \n ");
        int emergency_level = input.nextInt();

        System.out.println("Patient Unscousness :  \t 1 → Yes \n 0 → No ");
        int consc = input.nextInt();

        
       if(age == 0 || (emergency_level>3 || emergency_level <0))
       {
         System.out.println("Invalid statemnet ! \nTry again !");
       }
     
       if(emergency_level==1 || consc==1)
       {
        System.out.println("Patient Name : "+name);
        System.out.println("Patient Age : "+age);
         System.out.println("Emergency Level : "+emergency_level);
        System.out.println("Priority : High ");
         System.out.println("Doctor Action: Immediate Treatment ");

       }
       else if(emergency_level==2 && age >=60)
       {
        System.out.println("Patient Name : "+name);
        System.out.println("Patient Age : "+age);
         System.out.println("Emergency Level : "+emergency_level);
        System.out.println("Priority : High ");
        System.out.println("Doctor Action: Senior Emergency ");
         
       }

       else if(emergency_level==2)
       {
        System.out.println("Patient Name : "+name);
        System.out.println("Patient Age : "+age);
         System.out.println("Emergency Level : "+emergency_level);
        System.out.println("Priority : MEDIUM ");
        System.out.println("Doctor Action: Treat Soon ");

       }
       else if(emergency_level==3 && age <12)
       {
        System.out.println("Patient Name : "+name);
        System.out.println("Patient Age : "+age);
         System.out.println("Emergency Level : "+emergency_level);
         System.out.println("Priority : MEDIUM ");
        System.out.println("Doctor Action: Child Care ");

       }
       else
       {
        System.out.println("Patient Name : "+name);
        System.out.println("Patient Age : "+age);
         System.out.println("Emergency Level : "+emergency_level);
         System.out.println("Priority : LOW ");
        System.out.println("Doctor Action: Normal Queue ");


       }


        input.close();
    }
    
}


