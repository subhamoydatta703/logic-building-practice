// Given an integer n, find all unique prime factors of n. A prime factor is a prime number that divides n exactly (without leaving a remainder).

// Examples:

// Input: n = 100
// Output: [2, 5]
// Explanation: Unique prime factors of 100 are 2 and 5.
// Input: n = 60
// Output: [2, 3, 5]
// Explanation: Prime factors of 60 are 2, 2, 3, 5. Unique prime factors are 2, 3 and 5.

import java.util.ArrayList;
import java.util.Collections;

public class Question26 {

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

    static ArrayList<Integer> primeFactor(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if (n <= 0)
            return list;
        for (int i = 2; i * i <= n; i++) {
            if ((n % i == 0)) {
                if (isPrime(i) == true) {
                    list.add(i);
                }
                if ((i != n / i)) {
                    if (isPrime(n / i) == true) {
                        list.add((n / i));
                    }
                }
            }
        }
        Collections.sort(list);
        return list;

    }

    public static void main(String[] args) {
        System.out.println(primeFactor(100));
        System.out.println(primeFactor(60));
    }

}
