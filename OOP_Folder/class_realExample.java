package OOP_Folder;

  class dog_class {
        String color;
        String eye_color;
        float height; // Inch
        float weight; // kg
        int tail_number;
        String sound;

        void displayInfo() {
        System.out.println("Color: " + color + eye_color);
        System.out.println("Eye Color: " + eye_color);
        System.out.println("Height: " + height + " inch");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Tail Number: " + tail_number);
        System.out.println("Sound: " + sound);
    }

    }

public class class_realExample {

    public static void main(String[] args) {
        dog_class  dog = new dog_class();

        dog.color = "Black";
        dog.eye_color="Brown";
        dog.height= 64;
        dog.weight=12;
        dog.tail_number=1;
        dog.sound="Barking";

        dog.displayInfo();

    }
}
