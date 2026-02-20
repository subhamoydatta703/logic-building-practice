// Sum of Digits of a Number
// Given a number n, find the sum of its digits.

// Examples :

// Input: n = 687
// Output: 21
// Explanation: The sum of its digits are: 6 + 8 + 7 = 21

// Input: n = 12
// Output: 3
// Explanation: The sum of its digits are: 1 + 2 = 3


public class Question1 {
    static int getSum(int n){
        if(n==0) return 0;
        int t = n%10;
        return getSum(n/10) + t;

    }
    public static void main(String[] args) {
        System.out.print(getSum(687));
    }
}
