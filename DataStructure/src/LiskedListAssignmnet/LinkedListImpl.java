package LiskedListAssignmnet;

public class LinkedListImpl {

    Node head;
    public void addData(int data) {
        Node newTask = new Node(data);
        if(head == null) {
            head = newTask;
        }else{
            Node current = head;
            while ((current.next != null)) {
                current=current.next;
            }
            current.next = newTask;
        }

    }

//    public void removeAtPosition(int position) {
//        if (position < 0) {
//            System.out.println("Invalid position. Position should be non-negative.");
//            return;
//        }
//
//        if (position == 0) {
//            if (head != null) {
//                head = head.next;
//            } else {
//                System.out.println("List is empty hence we cannot remove elements from an empty list.");
//            }
//            return;
//        }
//        Node current = head;
//        int index = 0;
//
//        while (current != null && index < position - 1) {
//            current = current.next;
//            index++;
//        }
//
//        if (current == null || current.next == null) {
//            System.out.println('\n'+"Position not found so cannot remove.");
//            return;
//        }
//
//        current.next = current.next.next;
//        displayData();
//    }

    public void removeAtPosition(int position) {
        if (position < 0) {
            System.out.println("Invalid position. Position should be non-negative.");
            return;
        }

        if (head == null) {
            System.out.println("List is empty. Cannot remove elements from an empty list.");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null || current.next == null) {
            System.out.println("Position not found, cannot remove.");
            return;
        }

        current.next = current.next.next;
        displayData();
    }




    public void displayData() {
        Node current = head;
        if (current == null) {
            System.out.println("Your list is empty.");
            return;
        }
        while (current != null) {
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.print("null");

    }
}
