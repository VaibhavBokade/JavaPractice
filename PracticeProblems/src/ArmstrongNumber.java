public class ArmstrongNumber {
    public static void main(String[] args) {
        armstrongNumber(371);
    }

    public static void armstrongNumber(int num) {
        int remainder=0;
        int result =0;
        int temp=num;
        while (num !=0) {
            remainder = num % 10;
            result +=Math.pow(remainder, 3);
            num = num/ 10;
        }
        if (temp == result) {
            System.out.println("Number is Armstrong ");
        }else {
            System.out.println("Number is not armstrong");
        }

    }
}
