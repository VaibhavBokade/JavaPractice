package org.example.problem8;

/*
There is a string of lowercase English letters that is repeated infinitely many times.
Given an integer, , find and print the number of letter a's in the first letters of the infinite string.
Example
The substring we consider is , the first characters of the infinite string. There are occurrences of a in the substring.
Function Description
Complete the repeatedString function in the editor below.repeatedString has the following parameter(s):
s: a string to repeat
n: the number of characters to consider
Returns
int: the frequency of a in the substring
 */
public class RepeatedString {

    public static void main(String[] args) {
        long repeatedChar = repeatedString("abac", 10);
        System.out.println(repeatedChar);

    }

    public static long repeatedString(String str, long n) {
        long count=0;
        for (char ch:str.toCharArray()) {
            if(ch == 'a') {
                count++;
            }
        }
        long numberOfRepeat= n/ str.length();
        long totalNumberOfA= count * numberOfRepeat;
        long remainingChar = n%str.length();
        for (int i=0;i<remainingChar; i++) {
            if(str.charAt(i) == 'a') {
                totalNumberOfA++;
            }
        }
        return totalNumberOfA;
    }
}
