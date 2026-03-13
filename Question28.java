// Given three integers x, n, and M, compute (xn) % M (remainder when x raised to the power n is divided by M).

// Examples :

// Input:  x = 3, n = 2, M = 4
// Output: 1
// Explanation: 3^2 % 4 = 9 % 4 = 1.

// Input:  x = 2, n = 6, M = 10
// Output: 4
// Explanation: 2^6 % 10 = 64 % 10 = 4.

public class Question28 {
    static int modExp(int x, int n, int M) {
        if (n == 0)
            return 1;
        if (x == 0)
            return 0;
        int t = (int) Math.pow(x, n);
        return t % M;
    }

    public static void main(String[] args) {
        System.out.println(modExp(2, 6, 10));
    }
}
