package OOP_Folder;

public class constructor_basic {
    int height;
    String name;
    String color;

    constructor_basic(){
        height=4;
        name= "cow";
        color="RED";
    }

    public static void main(String[] args) {
        constructor_basic animal = new constructor_basic();
        System.out.println(animal.name);
        System.out.println(animal.height);
        System.out.println(animal.color);

    }
}
