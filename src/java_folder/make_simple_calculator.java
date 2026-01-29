package java_folder;
import java.util.Scanner;

public class make_simple_calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== SIMPLE CALCULATOR =====");
            System.out.println("1. Add Two Numbers");
            System.out.println("2. Subtract Two Numbers");
            System.out.println("3. Divide Two Numbers");
            System.out.println("4. Multiply Two Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if(choice >= 1 && choice <= 4) {
                System.out.print("Enter First Number: ");
                int num1 = input.nextInt();

                System.out.print("Enter Second Number: ");
                int num2 = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Added result = " + (num1 + num2));
                        break;

                    case 2:
                        System.out.println("Subtracted result = " + (num1 - num2));
                        break;

                    case 3:
                        if(num2 == 0) {
                            System.out.println("❌ Cannot divide by zero!");
                        } else {
                            float result = (float) num1 / num2;
                            System.out.println("Divided result = " + result);
                        }
                        break;

                    case 4:
                        System.out.println("Multiplied result = " + (num1 * num2));
                        break;
                }
            }
            else if(choice != 5) {
                System.out.println("Invalid choice!");
            }

        } while(choice != 5);

        System.out.println("Calculator Closed.");
        input.close();
    }
}
