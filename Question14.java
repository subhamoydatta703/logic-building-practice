// A number is a perfect number if it is equal to the sum of its proper divisors, that is, the sum of its positive divisors excluding the number itself. Find whether a given positive integer n is perfect or not.
// Examples: 

// Input: n = 15
// Output: false
// Explanation: Divisors of 15 are 1, 3 and 5. Sum of divisors is 9 which is not equal to 15.

// Input: n = 6
// Output: true
// Explanation: Divisors of 6 are 1, 2 and 3. Sum of divisors is 6.

public class Question14 {

    // method 1
    static boolean isperfectNumber(int n) {
        if (n <= 1)
            return false;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum != n)
            return false;
        return true;
    }

    // method 2(optimized)
    static boolean checkperfectNumber(int n) {
        if (n <= 1)
            return false;
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum = sum + (n / i);
                }
            }
        }
        if (sum != n)
            return false;
        return true;
    }

    public static void main(String[] args) {
        // System.out.println(isperfectNumber(8128));
        System.out.println(checkperfectNumber(496));

    }
}
