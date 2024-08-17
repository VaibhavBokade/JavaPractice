import java.util.HashMap;
import java.util.Map;

public class LetterOccurrences {
    public static void main(String[] args) {
        String str= "Pratima";
        Map<Character, Integer> characterIntegerMap = countLetterOccurrences(str);
        for (Map.Entry<Character,Integer> count : characterIntegerMap.entrySet()) {
            System.out.println(count.getKey()+ ": "+ count.getValue());
        }

    }

    public static Map<Character, Integer> countLetterOccurrences(String str) {
        Map<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i< str.length(); i++) {
            if (chars.containsKey(str.charAt(i))) {
                chars.put(str.charAt(i), chars.get(str.charAt(i))+1);
            }else {
                chars.put(str.charAt(i), 1);
            }
        }
        return chars;
    }
}
