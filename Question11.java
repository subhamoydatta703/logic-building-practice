// Given n, count all 'a' and 'b' that satisfy the condition a^3 + b^3 = n. Where (a, b) and (b, a) are considered two different pairs

// Examples:

// Input: n = 9
// Output: 2
// Explanation: 1^3 + 2^3 = 9 and 2^3 + 1^3 = 9

// Input: n = 28
// Output: 2
// Explanation: 1^3 + 3^3 = 28 and 3^3 + 1^3 = 28

public class Question11 {
    static int pairCube(int n) {
        int count = 0;
        for (int i = 1; i * i * i <= n; i++) {
            for (int j = 1; j * j * j <= n; j++) {
                if (((i * i * i) + (j * j * j)) == n)
                    count++;

            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(pairCube(9));

    }
}
