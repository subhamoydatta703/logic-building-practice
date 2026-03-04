// Given a positive integer n, find its square root. If n is not a perfect square, then return floor of √n.

// Examples :

// Input: n = 4
// Output: 2
// Explanation: The square root of 4 is 2.

// Input: n = 11
// Output: 3
// Explanation: The square root of 11 lies in between 3 and 4 so floor of the square root is 3.

public class Question18 {

    static int sqRoot(int n) {
        int i = 1;
        while (i * i <= n)
            i++;
        return i - 1;

    }

    public static void main(String[] args) {
        System.out.println(sqRoot(11));
    }
}
