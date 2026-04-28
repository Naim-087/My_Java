package OOP_Folder2;
import java.util.*;

public class all_operations {
    public static void main(String[] args) {

        // 1. Declaration
        ArrayList<Integer> list = new ArrayList<>();

        // 2. Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After adding: " + list);

        // 3. Inserting at specific index
        list.add(1, 15);
        System.out.println("After inserting at index 1: " +list);

        // 4. Adding multiple elements
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list.addAll(list2);
        System.out.println("After adding multiple: " +list);

        // 5. Adding multiple at specific index
        list.addAll(2, list2);
        System.out.println("After inserting multiple at index 2: " +list);

        // 6. Accessing element
        int first = list.get(0);
        System.out.println("First element: " + first);

        // 7. Updating element
        list.set(0, 999);
        System.out.println("After updating index 0: " + list);

        // 8. Removing element
        list.remove(1); // remove by index
        System.out.println("After removing index 1: " + list);

        list.remove(Integer.valueOf(200)); // remove by value
        System.out.println("After removing value 200: " + list);

        // 9. Checking size
        System.out.println("Size: " + list.size());

        // 10. Searching element
        System.out.println("Contains 100? " + list.contains(100));

        // 11. Finding index
        System.out.println("Index of 100: " + list.indexOf(100));

        // 12. Traversing
        System.out.println("Traversing:");
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();

        // 13. Extracting sublist
        ArrayList<Integer> sub = new ArrayList<>(list.subList(1, 3));
        System.out.println("Sublist (1 to 3): " + sub);

        // 14. Sorting
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // Descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending: " + list);

        // 15. Clearing list
        list.clear();
        System.out.println("After clearing: " + list);
    }
}