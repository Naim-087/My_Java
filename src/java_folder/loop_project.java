package java_folder;
import java.util.Scanner;
public class loop_project 
{
    public static void main(String[] args) 
    
    {
         
        Scanner input = new Scanner (System.in);

        int[] courseCode = {101, 102, 103, 104, 105};
          
           String[] CourseName ={
            "C Programming",
            "Discrete Math",
            "Data Structures",
            "OOP with Java",
            "Database"
        };

        int [] credit ={3,3,4,3,3};
    
       int choice;
       do
       { 
       
         System.out.println("\n=====Welcome to DIU Course regestration System \n");
         System.out.println("1. View Registered Courses");
         System.out.println("2.Add Course");
         System.out.println("3.Drop Course");
         System.out.println("4.View Total Credits");
         System.out.println("5.Exit");

         System.out.print("Enter your choice : ");
         choice = input.nextInt();

          switch (choice) 
          {
            case 1:
                System.out.println("Available Course : ");
                for(int i=0; i<courseCode.length;i++)
                {
                    System.out.println(courseCode[i] +" - "+CourseName[i]);
                }
                break;

            case 2:
                System.out.println("----You can regester two course only----");
                System.out.println("Enter the course code: ");
                int addcourse = input.nextInt();
                for(int i=0;i<courseCode.length;i++)
                {
                    if(courseCode[i]==addcourse)
                    {
                        System.out.println("Course Already  regestered !");
                    }
                    
                }

                System.out.println("You are eligible to regester the course!");
            
                 
                int oldsize=courseCode.length;

                // This works at runtime to add 2 slots 
                courseCode = java.util.Arrays.copyOf(courseCode, courseCode.length + 2);
               //  Increase the size 2 slots
                CourseName = java.util.Arrays.copyOf(CourseName, CourseName.length + 2);
              // increse credit size 2 slots
               credit = java.util.Arrays.copyOf(credit, credit.length+2);
               
                for(int i = oldsize; i<courseCode.length;i++)
                {
                System.out.println("----Adding Course No "+(i+1)+"-----");
                System.out.print("Enter Your Course Code: ");
                courseCode[i]=input.nextInt();

                  /*if(courseCode[i]==101 || courseCode[i]==101 || courseCode[i]==102|| courseCode[i]==103|| courseCode[i]==104 || courseCode[i]==105)
                    {
                       System.out.println("Course already regestered.");
                       break;
                    }*/

                input.nextLine();  // clear the buffer 

               
                System.out.print("Enter Course Name : ");
                CourseName[i]=input.nextLine();
               

                System.out.print("Enter Course Credit : ");
                credit[i]=input.nextInt();
                input.nextLine();

                } 

              for(int i=0; i<courseCode.length;i++)
                {
                    System.out.println( courseCode[i] +" - "+CourseName[i]);
                }
                break;

            case 3:
                 String userChoice; // Changed from array to String
    
                  do 
                  {
                    System.out.print("Enter Course code to drop : ");
                    int dropCourse = input.nextInt();
                   boolean found = false;

                         for (int i = 0; i < courseCode.length; i++) 
                        {
                           if (courseCode[i] == dropCourse) 
                          {
                             found = true;
                
                             // Shift all elements to the left
                            // Stop at length - 1 so j+1 doesn't break
                             for (int j = i; j < courseCode.length - 1; j++) 
                             {
                             courseCode[j] = courseCode[j + 1];
                             CourseName[j] = CourseName[j + 1];
                             credit[j] = credit[j + 1];
                             }

                              // Shrink the arrays
                              courseCode = java.util.Arrays.copyOf(courseCode, courseCode.length - 1);
                              CourseName = java.util.Arrays.copyOf(CourseName, CourseName.length - 1);
                              credit = java.util.Arrays.copyOf(credit, credit.length - 1);

                              System.out.println("Course dropped Successfully");
                              break; // Exit the 'for' loop
                            }
                        } 

                       if (!found) {
                        System.out.println("Course code not found.");
                        }

                        System.out.print("Do you want to drop another course? (yes/no): ");
                        userChoice = input.next();

                       } while (userChoice.equalsIgnoreCase("yes"));
                        break;

            case 4:
                int totalcredit =0;
                for(int val : credit)
                {
                    totalcredit+=val;
                }

                System.out.println("---Total Credit = "+totalcredit);
                break;



            case 5:
                System.out.println("Existing System, Good Bye !");
                break;


            default:
                System.out.println("Invalid Choice. Try Again!");
                



        }




               
            
     

      

      
        
       
     
    
    }while (choice!=5);
    input.close();

       
        
       
    
      
   }
}


