package OOP_Folder2;

public class variable_static {

     String address = "Dhaka,1205";
     String name = "Al khawarijmi ";
     int age = 56;
     static String level = "Software Engineer"; // reserved in static memory just one copy

      void method1()
      {
        int age= 57; 
        System.out.println("/instance variable : "+name);
        System.out.println("/instance variable : "+age);
        System.out.println("static variable : "+level);
        System.out.println(address);
      }

      void method2()
      {
        String level="Name";
        System.out.println("/instance variable : "+name);
        System.out.println("/instance variable : "+age);
        System.out.println("static variable : "+level);
        System.out.println("/instance variable : "+address);
      }

     public static void main(String[] args) 
      {
       variable_static object = new variable_static();

        object.method1();
        object.method2();
      }


    
}
