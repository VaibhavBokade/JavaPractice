import java.util.HashMap;
import java.util.Map;

public class WordOccurrences {
    public static void main(String[] args) {
        String str = "I am Java developer I am proud of it";
        Map<String, Integer> countWordOccurrences = countWordOccurrences(str);
        for (Map.Entry<String, Integer> wordCount : countWordOccurrences.entrySet()) {
                System.out.println(wordCount.getKey() + " :"+ wordCount.getValue());
        }
    }
    public static Map<String, Integer> countWordOccurrences(String str) {
        String [] words= str.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word: words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word)+1);
            }else {
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    }
}
