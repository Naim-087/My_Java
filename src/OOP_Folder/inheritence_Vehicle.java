package OOP_Folder;

 class vehicle{
     String brand;
     String color;
     int speed;
     String brak;


     vehicle(String brand,String color, int speed,String brak){
          
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.brak = brak;

        }
        void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
        System.out.println("Brake: " + brak);
      }
    }

    class car extends vehicle{

        String accelarate;
        double milage;
        car(String brand,String color,int speed, String brak,String accelarate,double milage){

            super(brand,color,speed,brak);

            this.accelarate = accelarate;
            this.milage = milage;

        }

        @Override
        void displayVehicle() {
            //TODO Auto-generated method stub
            super.displayVehicle();

            System.out.println("Accelarator : "+accelarate);
            System.out.println("Milage : "+milage);
        }
    }

    class bike extends vehicle{

        String cc;
        String abs;

        bike(String brand,String color,int speed, String brak,String cc,String abs){

            super(brand, color, speed, brak);
            this.cc =cc;
            this.abs = abs;
        }
        @Override
        void displayVehicle(){
            super.displayVehicle();
            System.out.println("CC : "+cc);
            System.out.println("Abs "+abs);
        }

    }
    
    //-----> Main Class
    public class inheritence_Vehicle{

        public static void main(String[] args) {

             car c = new car("Mercedez", "Black", 3600, "Ultra Hydrolic", "Strong", 25) ;

             bike b = new bike("Kawasaki", "Black", 170, "Hydrolic", "900", "Has Abs");

             c.displayVehicle();
             b.displayVehicle();
            
        }

     
    }

   

