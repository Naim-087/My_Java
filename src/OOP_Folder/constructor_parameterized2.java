package OOP_Folder;

public class constructor_parameterized2 {
    int order_id;
    String custname;
    String Fname;
   int qnty;
    double price;

  constructor_parameterized2(int order_id, String custname,String Fname, int qnty,double price){

    this.Fname = Fname;
    this.custname = custname;
    this.order_id = order_id;
    this.price = price;
    this.qnty = qnty;
  }

  public void calculation(double price, int qnty){
    double total;
    total = price * qnty;
    System.out.println("Total Bill : "+total);
   
    if(total>=1100){
        System.out.println(" 10 % Discount applied : "+total*0.1);
    }
    else{
        System.out.println("No Discount applied .");
    }
  }



  public static void  main(String[] args){

 constructor_parameterized2 food = new constructor_parameterized2(101, "Naim", "Burger", 3, 650);
 
  System.out.println("Customer Name : "+food.order_id);
  System.out.println("Customer Name : "+food.custname);
  System.out.println("Customer Name : "+food.Fname);
  food.calculation(650, 4);
  

  }

}
