import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};
        Set<Integer> commonElements = findCommonElements(a1, a2, a3);
//        for (int i=0; i<commonElements.length; i++) {
//            System.out.println(commonElements[i]);
//        }
        for (Integer i: commonElements) {
            System.out.println(i);
        }

    }

    public static Set<Integer> findCommonElements(Integer[] a1, Integer[] a2, Integer[] a3) {
       // int [] result = new int[a1.length];
        Set<Integer> result = new HashSet<>();
        //int idx=0;
        for (int i=0; i< a1.length; i++) {
            for (int j=0; j< a2.length; j++) {
                if (a1[i] == a2[j] && a1[i] == a3[j]) {
                    //result[idx] = a1[i];
                    result.add(a1[i]);
                    //idx++;
                }
            }
        }
        return result;
    }
}
