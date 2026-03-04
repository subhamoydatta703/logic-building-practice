// Given a number s represented as a string, determine whether the integer it represents is divisible by 13 or not.

// Examples :

// Input: s = "2911285"
// Output: true
// Explanation: 2911285 / 13 = 223945, which is a whole number with no remainder.

// Input: s = "27"
// Output: false
// Explanation: 27 / 13 ≈ 2.0769..., which is not a whole number (there is a remainder).

public class Question21 {

    static boolean divisibleByThirteen(String s) {
        int lastStr = s.length() - 1;
        int lastDig = s.charAt(lastStr) - '0';
        int num = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int curr = s.charAt(i) - '0';

            num = num * 10 + curr;

        }

        int t = lastDig * 4;

        if ((t + num) % 13 == 0)
            return true;
        else
            return false;

    }

    // method 2(better)
    static boolean optDivisibleByThirteen(String s) {

        int remainder = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            remainder = (remainder * 10 + digit) % 13;
        }

        if (remainder == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String s = "abcdef";
        int l = s.length() - 1;
        // System.out.println(divisibleByThirteen("27"));
        System.out.println(optDivisibleByThirteen("27"));
    }
}
