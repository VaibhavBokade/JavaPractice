import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        boolean anagram = isAnagram("Race", "care");
        System.out.println(anagram);

    }

    public static boolean isAnagram(String str1, String str2 ) {
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean check = Arrays.equals(arr1, arr2);
        if (check) {
            return true;
        }
        return false;

    }

}
