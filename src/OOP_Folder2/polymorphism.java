package OOP_Folder2;

// Method Overloading

public class polymorphism {
    int amount;
    String cardTypes;
    String phone;
    
    void payment(int amount){
        System.out.println("Payment : "+amount);
    }

    void payment(int amount,String cardTypes){

        System.out.println("Payment : "+amount);
        System.out.println("Card Type :"+cardTypes);
    }

    void payment(int amount, String cardTypes, String phone){

        System.out.println("Payment : "+amount);
        System.out.println("Card Type :"+cardTypes);
        System.out.println("Phone : "+phone);
    }

    public static void main(String[] args) {

        polymorphism pay = new polymorphism();
        
        pay.payment(4000,"Visa");
        pay.payment(600);
        pay.payment(36700,"Bkash ","018237873289");
       
     
        
    }

}



