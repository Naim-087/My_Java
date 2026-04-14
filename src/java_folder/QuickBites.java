
package java_folder;
import java.util.ArrayList;
import java.util.Scanner;

// 1. ABSTRACTION: Abstract class cannot be instantiated
abstract class FoodItem {
    // 2. ENCAPSULATION: Private fields
    private int id;
    private String name;
    private double price;
    private int quantity;

    public FoodItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { 
        return id; 
    }
    public String getName() { 
        return name; 
    }

    public double getPrice() { 
        return price; 
    }
    public int getQuantity() { 
        return quantity; 
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) this.quantity = quantity;
    }

    // 4. POLYMORPHISM: Abstract method to be overridden
    public abstract void displayInfo();

    public double calculateSubtotal() {
        return price * quantity;
    }
}

// 3. INHERITANCE: Specific Categories
class Burger extends FoodItem {
    private String pattyType;
    public Burger(int id, String name, double price, String patty) {
        super(id, name, price);
        this.pattyType = patty;
    }
    @Override
    public void displayInfo() {
        System.out.printf("ID: %-3d | Burger: %-15s | Patty: %-8s | Price: TK%.2f%n", getId(), getName(), pattyType, getPrice());
    }
}

class Soup extends FoodItem {
    private String thickness;
    public Soup(int id, String name, double price, String thickness) {
        super(id, name, price);
        this.thickness = thickness;
    }
    @Override
    public void displayInfo() {
        System.out.printf("ID: %-3d | Soup:    %-15s | Type: %-9s | Price: TK%.2f%n", getId(), getName(), thickness, getPrice());
    }
}

class Kabab extends FoodItem {
    private String spiceLevel;
    public Kabab(int id, String name, double price, String spice) {
        super(id, name, price);
        this.spiceLevel = spice;
    }
    @Override
    public void displayInfo() {
        System.out.printf("ID: %-3d | Kabab:   %-15s | Spice: %-8s | Price: TK%.2f%n", getId(), getName(), spiceLevel, getPrice());
    }
}

class Biriyani extends FoodItem {
    private String riceType;
    public Biriyani(int id, String name, double price, String rice) {
        super(id, name, price);
        this.riceType = rice;
    }
    @Override
    public void displayInfo() {
        System.out.printf("ID: %-3d | Biriyani:%-15s | Rice: %-9s | Price: TK%.2f%n", getId(), getName(), riceType, getPrice());
    }
}

class Beverage extends FoodItem {
    private int volume;
    public Beverage(int id, String name, double price, int volume) {
        super(id, name, price);
        this.volume = volume;
    }
    @Override
    public void displayInfo() {
        System.out.printf("ID: %-3d | Drink:   %-15s | Vol: %-4dml      | Price: TK%.2f%n", getId(), getName(), volume, getPrice());
    }
}

class Customer {
    private String name, mail, phone, address;
    public Customer(String name, String mail, String phone, String address) {
        this.name = name; 
        this.mail = mail; 
        this.phone = phone; 
        this.address = address;
    }
    public void printDetails() {
        System.out.println("\n--- RECEIPT FOR: " + name.toUpperCase() + " ---");
        System.out.println("Email: " + mail + " | Phone: " + phone);
        System.out.println("Address: " + address);
    }
}

public class QuickBites {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<FoodItem> menu = new ArrayList<>();
    private static ArrayList<FoodItem> cart = new ArrayList<>();
    private static Customer user;

    // METHOD TO CLEAR CONSOLE
    public static void clearScreen() {
        // ANSI escape code to clear terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        initMenu();
        clearScreen();
        System.out.println("Welcome to QuickBites");
        System.out.println("1. Signup\n2. Exit");
        int start = sc.nextInt();
        if (start == 2) return;
        sc.nextLine(); 

        clearScreen();
        System.out.println("--- Customer Registration ---");
        System.out.print("Name: "); 
        String name = sc.nextLine();
        System.out.print("Mail: "); 
        String mail = sc.nextLine();
        System.out.print("Phone: "); 
        String phone = sc.nextLine();
        System.out.print("Address: "); 
        String addr = sc.nextLine();
        user = new Customer(name, mail, phone, addr);
        System.out.println("\nSigned up successfully! Press Enter to continue...");
        sc.nextLine(); 

        while (true) {
            clearScreen();

            System.out.println("-- Select an Item to Add --");
            System.out.println("1. Burger\n2. Soup\n3. Kabab\n4. Biriyani\n5. Beverage\n6. Checkout and Summary\n7. Exit");

            int choice = sc.nextInt();
            if (choice == 6) { 
                clearScreen();

                showSummary(); 
                break; 
            }
            if (choice == 7) break;

            clearScreen();
            displayFilteredMenu(choice);
            System.out.print("\nEnter Item ID to add: ");
            int id = sc.nextInt();
            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            
            addItemToCart(id, qty);
            
            System.out.println("\nPress Enter to return to menu...");
            sc.nextLine(); // catch newline
            sc.nextLine(); // wait for user
        }
    }

    private static void initMenu() {
        // 5 Items for Burgers
        menu.add(new Burger(101, "Cheese Burger", 170, "Beef"));
        menu.add(new Burger(102, "Chicken Zinger", 199, "Chicken"));
        menu.add(new Burger(103, "BBQ Bacon", 250, "Beef"));
        menu.add(new Burger(104, "Veggie Patty", 299, "Veg"));
        menu.add(new Burger(105, "Mushroom Swiss", 310, "Beef"));

        // 5 Items for Soups
        menu.add(new Soup(201, "Corn Soup", 160, "Clear"));
        menu.add(new Soup(202, "Thai Soup", 180, "Creamy"));
        menu.add(new Soup(203, "Tomato Basil", 199, "Creamy"));
        menu.add(new Soup(204, "Hot & Sour", 210, "Clear"));
        menu.add(new Soup(205, "Mushroom Soup", 250, "Creamy"));

        // 5 Items for Kababs
        menu.add(new Kabab(301, "Seekh Kabab", 180, "High"));
        menu.add(new Kabab(302, "Reshmi Kabab", 250, "Mild"));
        menu.add(new Kabab(303, "Tikka Kabab", 299, "Medium"));
        menu.add(new Kabab(304, "Bihari Kabab", 320, "High"));
        menu.add(new Kabab(305, "Shami Kabab", 350, "Medium"));

        // 5 Items for Biriyani
        menu.add(new Biriyani(401, "Mutton Kacchi", 499, "Basmati"));
        menu.add(new Biriyani(402, "Chicken Dum", 290, "Basmati"));
        menu.add(new Biriyani(403, "Beef Tehari", 260, "Kalijira"));
        menu.add(new Biriyani(404, "Hyderabadi", 550, "Basmati"));
        menu.add(new Biriyani(405, "Prawn Biriyani", 440, "Basmati"));

        // 5 Items for Beverages
        menu.add(new Beverage(501, "Coca Cola", 30, 250));
        menu.add(new Beverage(502, "Pepsi", 30, 250));
        menu.add(new Beverage(503, "Fresh Lemonade", 80, 300));
        menu.add(new Beverage(504, "Cold Coffee", 110, 400));
        menu.add(new Beverage(505, "Mineral Water", 20, 500));
    }

    private static void displayFilteredMenu(int choice) {
        System.out.println("--- Available Items ---");
        for (FoodItem item : menu) {
            if ((choice == 1 && item instanceof Burger) || (choice == 2 && item instanceof Soup) ||
                (choice == 3 && item instanceof Kabab) || (choice == 4 && item instanceof Biriyani) ||
                (choice == 5 && item instanceof Beverage)) {
                item.displayInfo();
            }
        }
    }

    private static void addItemToCart(int id, int qty) {
        for (FoodItem item : menu) {
            if (item.getId() == id) {
                item.setQuantity(qty);
                cart.add(item);
                System.out.println(">> " + item.getName() + " added to cart!");
                return;
            }
        }
        System.out.println(">> Item ID not found.");
    }

    private static void showSummary() {
        user.printDetails();
        System.out.println("------------------------------------------------------------");
        double total = 0;
        for (FoodItem item : cart) {
            item.displayInfo();
            System.out.printf("    Qty: %d | Subtotal: TK%.2f%n", item.getQuantity(), item.calculateSubtotal());
            total += item.calculateSubtotal();
        }
        System.out.println("------------------------------------------------------------");
        System.out.printf("TOTAL BILL: TK%.2f%n", total);
        System.out.println("============================================================");
    }
}