package OOP_Folder;



public class object_creation { 
    static class Boxclass{  
        // main class static . static class theke boxclas ke access korar
        //jonno box class keo static banano lagbe nahole access kora jabena.
       private float height;
       private  float width;
       private String color;
       private int price;
       private String Brand;

     public void box_info()
     {
      System.out.println("Height : "+height);
      System.out.println("width : "+width);
      System.out.println("color : "+color);
      System.out.println("price : "+price);
      System.out.println("Brand : "+Brand);



     }

    }
    public static void main(String[] args) {
     
        Boxclass box = new Boxclass();

     
        box.height= 20.7f;
        box.width=10.5f;
        box.color="RED";
        box.price=3800;
        box.Brand="Naim co. lmtd";

       box.box_info();//method call


        
        
    }
}


