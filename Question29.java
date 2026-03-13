// Number of squares in a rectangle
// Given a m x n matrix, count the number of squares in the matrix.

// Examples :

// Input:  m = 2, n = 2
// Output: 5
// Explanation: There are 4 squares of size 1x1 + 1 square of size 2x2.

// Input: m = 4, n = 3
// Output: 20
// Explanation: There are 12 squares of size 1x1 + 6 squares of size 2x2 + 2 squares of size 3x3.

public class Question29 {
    static int sqrRect(int m, int n) {
        int total = 0;
        for (int k = 1; k <= Math.min(m, n); k++) {
            total += ((m - k + 1) * (n - k + 1));
        }
        return total;
    }

    public static void main(String[] args) {

        // System.out.println(sqrRect(3, 4));
        System.out.println(sqrRect(2, 2));
    }
}
