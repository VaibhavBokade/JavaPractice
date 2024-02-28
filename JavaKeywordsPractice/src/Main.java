// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int i=4;
    public  final int j=5;

    public void add() {
        i++;
       //j++; value of final will not change as it constant
        System.out.println(i+j);
    }

    public void substract() {
        System.out.println(i-j); //value of static will get updated hear
    }

    public static final void multiply(){
        System.out.println(i*j);
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.add();
        m.substract();

    }
}