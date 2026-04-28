package OOP_Folder2;
import java.util.Scanner;

public class variable_practise {
    void Show()
    {
        Scanner input = new Scanner(System.in);
        int age ;
        String name ;
        System.out.print("Enter your age : ");
        age = input.nextInt();
        input.nextLine();
        System.out.print("Enter your name : ");
        name = input.nextLine();
       

        System.out.println("my name is : "+name);
        System.out.println("my age is : "+age);
        input.close();


    }
    public static void main(String[] args) {
        variable_practise variable = new variable_practise();
        

        variable.Show();
    }
}
