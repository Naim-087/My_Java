package OOP_Folder;

class vehicle{
    String brand;
    String name;

    vehicle(String brand, String name){

        this.brand = brand;
        this.name = name;
    }

    void run(){
      System.out.println("Vehicle is running ");
    }

    void display(){
        System.out.println("Brand name : "+brand);
        System.out.println("Car name : "+name);
    }
}

class bike extends vehicle{

     String engine;
     String color;
     bike(String brand,String name,String engine, String color){

        super(brand, name);
        this.engine = engine;
        this.color = color;
     }

    void run(){

        display();

        System.out.println("Engine name : "+engine);
        System.out.println("color : "+color);
        

     }

}
class car extends vehicle{

     String engine;
     String color;
     car(String brand,String name,String engine, String color){

        super(brand, name);
        this.engine = engine;
        this.color = color;
     }

     void run(){

        display();
        System.out.println("Engine name : "+engine);
        System.out.println("color : "+color);
        

     }

}


public class polymorphism2 {
        public static void main(String[] args) {
        vehicle b = new bike("Suzuki _", "Suzuki_Zixer", "RPS Type", "Black green");

        vehicle c = new car("Toyota_", "Hybride", "Heavier Faster", "White");

        b.run();
        c.run();
        
    }

    
}


    

    
    

