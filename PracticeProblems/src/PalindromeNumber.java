public class PalindromeNumber {
    public static void main(String[] args) {
        isPalindrome(121);
        int	ar	[]	=	{232,	12,	78,	898,	34543,	45};
        for (int i=0; i < ar.length; i++){
            isPalindrome(ar[i]);
        }
    }

    public static void isPalindrome(int num) {
        int rev=0;
        int temp = num;
        while (num !=0) {
            rev = rev * 10+ (num%10);
            num = num/10;
        }
        if (rev == temp) {
            System.out.println(temp +" is palindrome number !");
        }else {
            System.out.println(temp +" is not palindrome number !");
        }
    }
}
