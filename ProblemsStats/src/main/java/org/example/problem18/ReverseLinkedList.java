package org.example.problem18;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next=new ListNode(5);
         System.out.println("Before reverse :");
         printList(head);
        ListNode listNode = reverseList(head);
        System.out.println("After reverse :");
        printList(listNode);

    }

    public static void printList(ListNode head) {
        if(head == null) {
            System.out.println("List is null");
            return;
        }
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val +" -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode previous = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current= next;
        }
        return previous;
    }
}
