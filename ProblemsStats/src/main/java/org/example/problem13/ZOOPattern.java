package org.example.problem13;

import java.util.Scanner;
/*
You are required to enter a word that consists of
 and
 that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if
Determine if the entered word is similar to word zoo.
For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.
Input format
First line: A word that starts with several Zs and continues by several Os.
Note: The maximum length of this word must be.
Output format
Print Yes if the input word can be considered as the string zoo otherwise, print No.
 */
public class ZOOPattern {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            ZOOPattern.checkWord(input);
    }
    public static boolean checkLength(String word) {
        return word.length() <= 20;

    }

    public static void checkWord(String word) {
        if (checkLength(word)) {
            int zCount = 0, oCount = 0;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'z') {
                    zCount++;
                } else if (word.charAt(i) == 'o') {
                    oCount++;
                }
            }

            if (oCount == 2 * zCount) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
