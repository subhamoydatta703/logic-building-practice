// Given the non-negative integers n , compute the factorial of a given number.
// Note: Factorial of n is defined as n * (n -1) * (n - 2) * ... * 1, for n = 0, factorial is 1.

// Examples:

// Input: n = 5
// Output: 120
// Explanation: 5! = 5 * 4 * 3 * 2 * 1 = 120

// Input: n = 4
// Output: 24
// Explanation: 4! = 4 * 3 * 2 * 1 = 24

public class Question8 {
    static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
