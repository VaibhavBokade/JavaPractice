package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        Iterator<String> iterator = list.iterator();
        System.out.println("Iterating through the list using iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator<String> itr = list.listIterator();
        System.out.println("Iterating through the list using List iterator:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
