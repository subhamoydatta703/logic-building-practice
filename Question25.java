// Given a positive integer n, find all the distinct divisors of n.

// Examples:

// Input: n = 10
// Output: [1, 2, 5, 10]
// Explanation: 1, 2, 5 and 10 are the divisors of 10.

// Input: n = 100
// Output: [1, 2, 4, 5, 10, 20, 25, 50, 100]
// Explanation: 1, 2, 4, 5, 10, 20, 25, 50 and 100 are divisors of 100.

import java.util.ArrayList;
import java.util.Collections;

public class Question25 {
    static ArrayList<Integer> posNumDiv(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if (n <= 0)
            return list;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add((n / i));
                }
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(posNumDiv(10));
        System.out.println(posNumDiv(100));
        System.out.println(posNumDiv(-1));
    }
}
