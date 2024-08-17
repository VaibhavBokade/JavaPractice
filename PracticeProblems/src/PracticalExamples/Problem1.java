package PracticalExamples;

public class Problem1 {
    private static int num;
    private int val=5;
    private final int constant=3;



    public Problem1(int val, int constant) {
        this.val = val;
        //this.constant = constant;
    }

    public static void addValues(int i) {
        int sum = num + i;
        //int sum1 = val +i; static method can not allowed non static variable
        //int sum1 = constant + i; static method does not allow final variable
        System.out.println("Addition of static method :"+sum);
    }

    public void addition(int j) {
        this.val=2;
        int sum= num +j;
        int sum1 = val + j;
        int sum2= constant + j;
        System.out.println("Addition of non static method :"+sum);
        System.out.println("Addition of non static method :"+sum1);
        System.out.println("Addition of non static method :"+sum2);

    }

    public static void main(String[] args) {
        Problem1 problem1=new Problem1(10,20);
        problem1.addition(5);
        Problem1.addValues(30);
    }



}
