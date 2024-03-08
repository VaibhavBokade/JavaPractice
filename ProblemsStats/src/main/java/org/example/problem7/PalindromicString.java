package org.example.problem7;

public class PalindromicString {
    public static void main(String[] args) {
        String palindrome = isPalindrome("abad");
        System.out.println(palindrome);
    }

    public static String isPalindrome(String str) {
        String rev="";
        for (int i= str.length()-1;i>=0;i--) {
            rev = rev+ str.charAt(i);
        }
        if(str.equals(rev)) {
            return "YES";
        }else {
            return "No";
        }
    }
}
