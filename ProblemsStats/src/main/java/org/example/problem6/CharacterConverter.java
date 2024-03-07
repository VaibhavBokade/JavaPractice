package org.example.problem6;

public class CharacterConverter {

    public static String checkCharSeq(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i< str.length();i++) {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }

}
