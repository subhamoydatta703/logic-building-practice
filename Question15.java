// Nth Fibonacci Number
// Given a positive integer n, find the nth Fibonacci number.

// The Fibonacci series is a sequence where a term is the sum of previous two terms. The first two terms of the Fibonacci sequence are 0 followed by 1. The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21.

// Example:

// Input: n = 2
// Output: 1
// Explanation: 1 is the 2nd number of Fibonacci series.

// Input: n = 5
// Output: 5
// Explanation: 5 is the 5th number of Fibonacci series.

public class Question15 {

    static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
