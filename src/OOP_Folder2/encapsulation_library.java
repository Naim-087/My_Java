package OOP_Folder2;

public class encapsulation_library {
    private int bookid;
    private String title;
    private String author;
    private int price;
    private int avacop;

    //  Constructor
    encapsulation_library(int bookid, String title, String author, int price, int avacop) {

        this.bookid = bookid;
        this.title = title; 
        this.author = author;

        // Validation
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }

        if (avacop >= 0) {
            this.avacop = avacop;
        } else {
            this.avacop = 0;
        }
    }

    // Getters
    public int getId() {
        return bookid;
    }

    public String gettitle() {
        return title;
    }

    public String getauthor() {
        return author;
    }

    public int getprice() {
        return price;
    }

    public int getavacop() {
        return avacop;
    }

    //  Borrow Book (FIXED LOGIC)
    void borrow_book(int qnty) {
        if (qnty > 0 && qnty <= avacop) {
            avacop = avacop - qnty;   //  corrected
            System.out.println(qnty + " book(s) borrowed.");
        } else {
            System.out.println("Not enough copies available.");
        }
    }

    //  Return Book (with validation)
    void return_book(int qnty) {
        if (qnty > 0) {
            avacop += qnty;
            System.out.println(qnty + " book(s) returned.");
        } else {
            System.out.println("Invalid quantity.");
        }
    }

    //  Update Price (added - important for exam)
    void update_price(int newprice) {
        if (newprice > 0) {
            price = newprice;
            System.out.println("Price updated.");
        } else {
            System.out.println("Invalid price.");
        }
    }

    //  Display Method (added)
    void display() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available Copies: " + avacop);
        System.out.println("------------------------");
    }

    //  Main Method (added for testing)
    public static void main(String[] args) {

        encapsulation_library b1 = new encapsulation_library(101, "Java", "Naim", 500, 5);

        b1.display();

        b1.borrow_book(2);
        b1.display();

        b1.return_book(1);
        b1.display();

        b1.update_price(600);
        b1.display();

        b1.borrow_book(10); // invalid case
    }
}