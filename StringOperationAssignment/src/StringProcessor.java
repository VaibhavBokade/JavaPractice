public class StringProcessor implements StringProcessorInterface {
    private String inputString;

    public StringProcessor(String inputString) {
        this.inputString = inputString;
    }

    public String reverseString() {
        String reverse = "";
        for (int i = 0; i < this.inputString.length(); i++) {
            char ch = this.inputString.charAt(i);
            reverse = ch + reverse;
        }
        //System.out.println("Reversed word: " + reverse);
        return reverse;
    }

    public String convertToLower() {
        return inputString.toLowerCase();
    }

    public String convertToUpper() {
        return inputString.toUpperCase();
    }

    public int[] countVowelsAndConsonants() {
        int voewls = 0;
        int consonants = 0;
        inputString = inputString.toLowerCase();

        for (int i = 0; i < this.inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u') {
                    voewls++;
                } else {
                    consonants++;
                }

            }
        }
        return new int[]{voewls, consonants};
    }
}
