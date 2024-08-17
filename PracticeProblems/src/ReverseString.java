public class ReverseString {
    public static void main(String[] args) {
        String str= "Vaibhav";
        char [] arr = str.toCharArray();
        for (int i=arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
        reverse("Chetan");
        System.out.println();
        reverseSentence("Vaibhav and Chetan are best friends");
    }

    public static void reverse(String str) {
        for (int i=str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    public static void reverseSentence(String str) {
        String [] val = str.split(" ");
        for (int i= val.length-1; i >= 0; i--) {
            reverse(val[i]+" ");
        }
    }
}
