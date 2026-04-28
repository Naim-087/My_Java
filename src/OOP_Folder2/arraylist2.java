package OOP_Folder2;

import java.util.ArrayList;

public class arraylist2 {
    public static void main(String[] args) {
        // Changed "Phones" to "phones" to match your usage below
        ArrayList<String> phones = new ArrayList<>();

        phones.add("SamSung Galaxy");
        phones.add("Vivo");
        phones.add("IQoo Z9");
        phones.add("Redmi Note");
        phones.add("Iphone 14");

        for (int i = 0; i < phones.size(); i++) {
            System.out.println(phones.get(i));
        }
    }
}