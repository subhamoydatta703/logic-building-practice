// Given a positive integer, check if the number is prime or not. A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. Examples of the first few prime numbers are {2, 3, 5, ...}
// Examples : 

// Input:  n = 11
// Output: true

// Input:  n = 15
// Output: false

// Input:  n = 1
// Output: false 

public class Question3 {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
            // break;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.print(isPrime(27));
    }
}
