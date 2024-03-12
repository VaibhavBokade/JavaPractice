package org.example.problem9;

public class CommonChild {
    public static void main(String[] args) {
        int commonChild = commonChild("ABCD", "ABDC");
        System.out.println("Common childs are "+commonChild);

    }

   // public static booleancheck

//    public static int commonChild(String s1, String s2) {
//        int maxLength=0;
//        for(int i=0;i<s1.length(); i++) {
//            for (int j=0; j < s2.length(); j++) {
//                if (s1.charAt(i) == s2.charAt(j)) {
//                    int length = 1;
//                    int m = i+1;
//                    int n = j+1;
//
//                    while (m<s1.length() && n< s2.length() && s1.charAt(m) == s2.charAt(n)) {
//                        length++;
//                        m++;
//                        n++;
//                    }
//                    maxLength= Math.max(maxLength,length);
//                }
//            }
//        }
//        return maxLength;
//    }

    public static int commonChild(String s1, String s2) {
        int []dp = new int[s2.length()+1];

        for (int i=1; i<= s1.length(); i++) {
            int prev= 0;
            for (int j=1; j<=s2.length();j++) {
                int temp= dp[j];
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[j]=prev+1;
                }else {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                prev = temp;
            }
        }
        return dp[s2.length()];
    }
}
