import java.util.Arrays;

public class CheckArrayContainSpecificElement {
    public static void main(String[] args) {
        int [] arr = {10,20,50,30,70,40,60,90,80};

        boolean anyMatch = Arrays.stream(arr)
                .anyMatch(n -> n == 100);

        if(anyMatch) {
            System.out.println("Array contains this element");
        }else {
            System.out.println("Array doesn't have this element");
        }
    }
}
