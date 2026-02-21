// Input: a = 20, b = 28
// Output: 4
// Explanation: The factors of 20 are 1, 2, 4, 5, 10 and 20. The factors of 28 are 1, 2, 4, 7, 14 and 28. Among these factors, 1, 2 and 4 are the common factors of both 20 and 28. The greatest among the common factors is 4.

// Input: a = 60, b = 36
// Output: 12
// Explanation: GCD of  60 and 36 is 12.

public class Question12 {

    static int gcd(int n1, int n2) {
        int max = Integer.MIN_VALUE;
        for (int i = 2; i <= Math.min(n1, n2); i++) {
            if ((n1 % i == 0) && (n2%i==0)) {
                max = Math.max(max, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(gcd(12, 4));
    }
}
