package OOP_Folder;

import java.util.ArrayList;

public class Array_list_remove {
    
        public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();

        System.out.println(number.size());

        number.add(10);
        number.add(20);
        number.add(60);
        number.add(90);
        number.add(7);
        number.add(39);
        System.out.println(number.get(3));

        number.set(3, 567);

        System.out.println(number.remove(3));

        System.out.println(number.size());
    }
}
