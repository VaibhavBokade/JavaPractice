import java.util.Enumeration;
import java.util.Vector;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Vaibhav");
        vector.add("30");
        vector.add(null);
        vector.add("Vaibhav");
        vector.add("Omkar");
        vector.add("Kuldeep");
        vector.removeElement("Omkar");
        vector.add("CCC");
        System.out.println(vector);

        Enumeration e = vector.elements();
        while (e.hasMoreElements()){
            String s = (String) e.nextElement();
            System.out.println(s);
        }
    }

}