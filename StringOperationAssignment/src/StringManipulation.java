import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StringManipulation {
    public static void main(String[] args) {
        //hear we take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String ");
        String inputString = sc.nextLine();

        System.out.println("Choose an operation:");
        System.out.println("1. Reverse the String");
        System.out.println("2. Convert String to LOWER case");
        System.out.println("3. Convert String to UPPER case");
        System.out.println("4. Count vowels and consonants");

        int choice = sc.nextInt();
// hear we created the object of stringProcessor class for calling
        StringProcessor processor = new StringProcessor(inputString);
        switch (choice) {
            case 1:
                String reverseString = processor.reverseString();
                System.out.println("Reversed String: " + reverseString);
                break;

            case 2:
                String lowerCaseString = processor.convertToLower();
                System.out.println("Lowercase String: " + lowerCaseString);
                break;
            case 3:
                String upperCaseString = processor.convertToUpper();
                System.out.println("Uppercase String: " + upperCaseString);
                break;
            case 4:
                int [] counts = processor.countVowelsAndConsonants();
                System.out.println("Vowels: " + counts[0]);
                System.out.println("Consonants: " + counts[1]);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }
        sc.close();
    }
}