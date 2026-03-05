// Given two numbers, n and r, the task is to compute nPr, which represents the number of ways to arrange r elements from a set of n elements. 
// It is calculated using the formula n!/(n−r)!, where "!" denotes the factorial operation.
// Examples:

// Input: n = 5
//            r = 2
// Output: 20
// Explanation: 5P2 = 5! / (5 - 2)!  = 20

// Input: n = 6
//            r = 3
// Output: 120
// Explanation: 6P3 = 6! / (6 - 3)!  = 12

public class Question23 {
    static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n - 1);
    }

    static float npr(int n, int r){
        if(n==0) return 0;
        float val = fact(n)/fact(n-r);
        return val;
    }

    public static void main(String[] args) {
        System.out.println(npr(5, 2));
    }
}
