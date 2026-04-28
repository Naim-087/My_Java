package OOP_Folder2;

 /* class className {*/ 
 

 class Student 
{
   public String name;   // ***Instance Variable
   public int id;

   public void m1 () { // *** Instance Method

      System.out.println("Instance method,M1 is working ...");
   }
    
};

public class class_Creation {
    public static void main(String[] args) {

        // classname variable = new classname() ---- how to create  a class
        Student s1 = new Student();  // object 1
        Student s2 = new Student();
        s1.id=101;
        s1.name= "Ahmed";
        s2.id=202;
        s2.name="farrukh";
        System.out.println(s1.name+"\t"+s1.id);
        System.out.println(s2.id+"\t"+s2.name);
        s1.m1();


      
    }
}

