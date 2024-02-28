import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        //list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.addFirst(10);
        list.addLast(60);
        System.out.println(list);
        list.add(null);
        list.add(3, 55);
        System.out.println(list);

        System.out.println(list.contains(90));
        list.getFirst();
    }
}
