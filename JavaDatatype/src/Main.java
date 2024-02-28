// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    int i =2;

    int j= 4;
    //System.out.println(j);
    public void pqr(int i) {
        i++;
        System.out.println(i);
    }

    public int xyz(int j) {
        System.out.println(j);
        j++;
        return j;
    }

    public static void main(String[] args)
    {
        Main m = new Main();

         m.pqr(3);
        int val =m.xyz(6);
        //System.out.println(i);
        System.out.println(val);
    }
    }

