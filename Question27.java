// Given a positive integer n ( 1 <= n <= 1015). Find the largest prime factor of a number.

// Input: 6
// Output: 3
// Explanation Prime factor are 2 and 3. Largest of them is 3.

// Input: 15
// Output: 5
// Explanation: Prime factors are 3 and 5. The largest of them is 5.

// Input: 28
// Output: 7
// Explanation: Prime factors are 2 and 7. The largest of them is 7.

import java.util.ArrayList;
import java.util.Collections;

public class Question27 {
    
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

    static int largestPrimeFactor(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if (n <= 0)
            return -1;
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
        // Collections.sort(list);
        return Collections.max(list);

    }
    
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(0));
    }
}
