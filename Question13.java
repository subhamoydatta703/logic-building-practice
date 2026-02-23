// Given two positive integers a and b. Find the Least Common Multiple (LCM) of a and b.
// LCM of two numbers is the smallest number which can be divided by both numbers.

// Input :  a = 10, b = 5
// Output :  10
// Explanation : 10 is the smallest number divisible by both 10 and 5

// Input :  a = 5, b = 11
// Output :  55
// Explanation : 55 is the smallest number divisible by both 5 and 11

public class Question13 {

    static int optGCD(int a, int b) {
        if (b == 0)
            return a;

        return optGCD(b, a % b);
    }

    static int lcm(int a, int b) {

        int val = optGCD(a, b);

        int result = (a * b) / val;

        return result;

    }

    public static void main(String[] args) {
        System.out.println(lcm(5, 11));

    }
}
