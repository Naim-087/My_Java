package OOP_Folder2;



public class constructor_overloading {
    private int height,width,price;
    private String name,color,Brand;

    constructor_overloading(){
        height=20;
        width=10;
        price =4000;
        name="Utility Box";
        color="pinkish White ";
        Brand="ABC co. ltd";
    }

    constructor_overloading(int height,int width,int price,String name,String color, String Brand){

        this.height=height;
        this.width=width;
        this.price=price;
        this.name=name;
        this.color=color;
        this.Brand=Brand;
    }

    void info(){
        System.out.println("height - "+height+"\nwidth - "+width+"\n price - "+ price+"\nname - "+name+"\n color - "+ color+"\nBrand - "+Brand+"\n\n");
    }
    public static void main(String[] args) {

    constructor_overloading box1 = new constructor_overloading(100,60,
        88000,"Magic Box","Blue sky",
        "XYZ co. ltd.");
       
    constructor_overloading box2 = new constructor_overloading();

    box1.info();
    box2.info();
    }
}
