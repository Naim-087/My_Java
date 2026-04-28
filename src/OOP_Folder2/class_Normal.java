package OOP_Folder2;

public class class_Normal { // regular class
    String Name;
    String Brand;
    int price;

    void info(){
        System.out.println("Name : "+Name);
           System.out.println(" Brand : "+ Brand);
              System.out.println("price : "+price);
    }

    public static void main(String[] args) {
        class_Normal phone = new class_Normal();

        phone.Name="IPhone 17 ";
        phone.Brand ="Apple ";
        phone.price=170000;

        phone.info();
    }
    
}
