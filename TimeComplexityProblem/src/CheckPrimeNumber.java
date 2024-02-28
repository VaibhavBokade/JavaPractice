public class CheckPrimeNumber {
     // In this code loop iterates n times so the Time complexity for this code is O(n)
    //Also value of number is stores one time and then use everywhere so its Space complexity is O(1)..
    public static boolean isPrime(int number) {
        if(number == 1){
            return false;
        }
        for(int i=2; i< number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
