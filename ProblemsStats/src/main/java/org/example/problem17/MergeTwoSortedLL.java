package org.example.problem17;

import java.util.LinkedList;

public class MergeTwoSortedLL {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(9);
        l1.add(10);

        l2.add(2);
        l2.add(4);
        l2.add(8);
        LinkedList<Integer> mergesort = mergesort(l1, l2);
        System.out.println(mergesort);

    }
    public static LinkedList<Integer> mergesort(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> sortedlist = new LinkedList<>();
        int i = 0, j = 0;
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) < l2.get(j)) {
                sortedlist.add(l1.get(i));
                i++;
            } else {
                sortedlist.add(l2.get(j));
                j++;
            }
        }
        while (i < l1.size()) {
            sortedlist.add(l1.get(i));
            i++;
        }
        while (j < l2.size()) {
            sortedlist.add(l2.get(j));
            j++;
        }
        return sortedlist;
    }
}