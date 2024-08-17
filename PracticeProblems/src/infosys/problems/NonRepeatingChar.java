package infosys.problems;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str ="aaabbbcdde";
        Map<Character, Integer> map = NonRepeatingChar.nonRepeatChar(str);
        char [] arr = new char[str.length()];
        int idx=0;
        for (Map.Entry<Character, Integer> chars: map.entrySet() ) {
            if(chars.getValue() == 1) {
                arr[idx] = chars.getKey();
                idx++;
            }
        }
        for (int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static Map<Character, Integer> nonRepeatChar(String str) {
        Map<Character, Integer> chars = new HashMap<>();
        for (int i=0; i<str.length(); i++) {
            if (chars.containsKey(str.charAt(i))) {
                chars.put(str.charAt(i), chars.get(str.charAt(i))+1);
            }else {
                chars.put(str.charAt(i),1);
            }
        }
        return chars;
    }
}
