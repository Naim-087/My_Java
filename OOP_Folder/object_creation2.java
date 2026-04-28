package OOP_Folder;

public class object_creation2 {

    String name;
    int age;
    float height;
    String hair_col;

    void info()
    {
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
        System.out.println("height : "+height);
        System.out.println("hair_col : "+hair_col);
    }

    public static void main(String[] args) {
        object_creation2 man = new object_creation2();
        man.name="Mr. Engn Naimul Islam ";
        man.age=22;
        man.height=5.4f;
        man.hair_col="Black Red";

        man.info();
         
    }
    
}
