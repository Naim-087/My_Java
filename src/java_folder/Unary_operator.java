package java_folder;

public class Unary_operator {
    public static void main(String[] args) 
    {
    int x = 10;
      

        // 1. Unary Plus and Minus
        System.out.println("Unary Plus: " + (+x));    // 10
        System.out.println("Unary Minus: " + (-x));   // -10

        // 2. Increment (Pre and Post)
        System.out.println("Original x: " + x);
        // Prints 10, then x becomes 11
        System.out.println("Post-increment (x++): " + (x++)); 
        // x becomes 12, then prints 12
        System.out.println("Pre-increment (++x): " + (++x));  

        // 3. Decrement (Pre and Post)
        System.out.println("Post-decrement (x--): " + (x--)); // Prints 12, then x becomes 11
        System.out.println("Pre-decrement (--x): " + (--x));  // x becomes 10, then prints 10

      


    }
}
