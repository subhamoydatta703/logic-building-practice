// Given three numbers a, b and k, find k-th digit in ab from right side

// Examples:
// Input : a = 3, b = 3, k = 1
// Output : 7
// Explanation: 3^3 = 27 for k = 1. First digit is 7 in 27

// Input : a = 5, b = 2,  k = 2
// Output : 2
// Explanation: 5^2 = 25 for k = 2. First digit is 2 in 25

public class Question22 {
    static int kthDigit(int a, int b, int k) {
        int num = (int) Math.pow(a, b);
        for (int i = 1; i < k; i++) {
            num = num / 10;
        }
        return num % 10;
    }

    public static void main(String[] args) {
        System.out.println(kthDigit(3, 3, 1));
    }
}
