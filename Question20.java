// Given a number in the form of string s, Check if the number is divisible by 11 or not. The input number may be large and it may not be possible to store it even if we use long long int.

// Examples:

// Input: s = "76945"
// Output: true
// Explanation: s when divided by 11 gives 0 as remainder.

// Input: s = "7695"
// Output: false
// Explanation: s does not give 0 as remainder when divided by 11.

// Input: s = "1234567589333892"
// Output: true
// Explanation:  s when divided by 11 gives 0 as remainder.

public class Question20 {
    static boolean divisibleByEleven(String s) {
        int odd = 0, even = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - '0';
            if (i % 2 != 0)
                odd += curr;
            else
                even += curr;
        }
        int diff = Math.abs(odd - even);
        if (diff % 11 == 0)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(divisibleByEleven("7695"));
    }
}
