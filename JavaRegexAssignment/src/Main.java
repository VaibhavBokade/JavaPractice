import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String [] strArr= {"Google123", "Java456", "Program", "Assigment","12345"};
        String pattern = "\\d$";
        Pattern ptr = Pattern.compile(pattern);

        for(String str: strArr) {
            Matcher matcher = ptr.matcher(str);
            if(matcher.find()) {
                System.out.println(str + " is ending with number");
            }else{
                System.out.println(str + " is not ending with number");
            }
        }

    }
}