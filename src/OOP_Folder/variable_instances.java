package OOP_Folder;

public class variable_instances {
    // Declared Instance Variable with access modifier

     public String name = " MY Name is Naimul Islam ";
     public int age = 22;
     public float cgpa = 3.87f;

     void introduction(){
        System.out.println(name);
        System.out.println("My age : "+age);
        System.out.println("My cgpa : "+cgpa);
     }


     public static void main (String[] args)
     {
        variable_instances intro = new variable_instances();

        intro.introduction();
     }

        
        
        
        
     }

