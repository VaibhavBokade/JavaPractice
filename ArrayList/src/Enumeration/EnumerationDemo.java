package Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String [] args) {
        Vector v = new Vector();
        for(int i=0; i<= 10; i++){
            v.add(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();

        while (e.hasMoreElements()){
            int i = (int) e.nextElement();
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
