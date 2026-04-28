package OOP_Folder2;

public class constructor_overloading2 {
    private int height , width;
    
    public constructor_overloading2()  {
        height = 10;
        width = 15;
    }
    public constructor_overloading2 (int height, int width)  {
        this.height = height;
        this.width = width;
    }
    public static void main(String[] args)  {
      constructor_overloading2 b1 = new constructor_overloading2();
      constructor_overloading2 b2 = new constructor_overloading2(20,30);
      constructor_overloading2 b3 = new constructor_overloading2(50,60);
      constructor_overloading2 b4 = new constructor_overloading2();

        System.out.println("For Box-1: Height = " + b1.height+ " Width = " +b1.width+"\n");
        System.out.println("For Box-2: Height = " + b2.height+ " Width =  "+b2.width+"\n");
        System.out.println("For Box-3: Height = " + b3.height+ " Width = " +b3.width+"\n");
        System.out.println("For Box-4: Height = " + b4.height+ " Width = "+b4.width+"\n");
    }
}
    

