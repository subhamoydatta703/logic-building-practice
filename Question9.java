// Last Updated : 3 Oct, 2025
// Given an integer n, determine whether it is a palindrome number or not. A number is called a palindrome if it reads the same from forward and backward.

// Examples:

// Input: n = 12321
// Output: True
// Explanation: 12321 is a palindrome number because it reads same  forward and backward.

// Input: n = 1234
// Output:  False
// Explanation: 1234 is not a palindrome number because it does not read the same forward and backward.

public class Question9 {
    public static int rev(int n, int revN) {
        if (n == 0)
            return revN;
        revN = revN * 10 + (n % 10);
        return rev(n / 10, revN);
    }

    static boolean isPalindrome(int n) {
        int t = rev(n, 0);
        if (n == t)
            return true;
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
}
