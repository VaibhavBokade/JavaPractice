package org.example.problem3;

public class Check {

    public static boolean validateTag(String tag) {
        if (!checkLength(tag)) {
            return false;
        }

        if (!(Character.isDigit(tag.charAt(0)) && tag.charAt(0) != '0')) {
            return false;
        }

        if (!(Character.isDigit(tag.charAt(1)) && Character.isDigit(tag.charAt(3)))) {
            return false;
        }

        if (isVowel(tag.charAt(2))) {
            return false;
        }

        if (!(Character.isDigit(tag.charAt(5)) && Character.isDigit(tag.charAt(6)) && Character.isDigit(tag.charAt(7)))) {
            return false;
        }

        if (tag.charAt(8) != '-') {
            return false;
        }

        if (!checkSumOfConsecutiveDigits(tag)) {
            return false;
        }

        return true;
    }

    public static boolean checkLength(String tag) {
        return tag.length() == 9;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'Y';
    }

    public static boolean checkSumOfConsecutiveDigits(String tag) {
        int sum = 0;
        for (int i = 0; i < tag.length() - 1; i++) {
            if (Character.isDigit(tag.charAt(i)) && Character.isDigit(tag.charAt(i + 1))) {
                int digit1 = Character.getNumericValue(tag.charAt(i));
                int digit2 = Character.getNumericValue(tag.charAt(i + 1));
                if ((digit1 + digit2) % 2 != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

