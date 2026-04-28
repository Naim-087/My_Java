package OOP_Folder2;

class simple_private{
    private int age  =21;

  void show(){

        System.out.println("Called From main function. ");
    }
}

public class access_modifi_private {

    public static void main(String[] args) {
        simple_private obj = new  simple_private();

       obj.show();
       // System.out.println(obj.age);

    }
    /*
    The code will give you runtime errror because of we tried to make access age 
    from main method as age is a private varibale so it cannot be accessed 
    without the class it declared
     */
    
}
