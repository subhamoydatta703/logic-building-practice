// Given a number n, print count of numbers in the range from 1 to n having exactly 3 divisors.

// Examples:

// Input: n = 16
// Output: 2
// Explanation: Only 4 and 9 have exactly three divisors.

// Input: n = 100
// Output: 4
// Explanation: 4, 9, 25 and 49 have exactly three divisors.

public class Question19 {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }

    static int countDivOfThree(int n) {
        int c = 0;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime(i)) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(countDivOfThree(100));
    }
}
