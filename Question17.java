// Given a number n, find the n-th term in the series 1, 3, 6, 10, 15, 21...

// Examples

// Input  3
// Output 6

// Input  4
// Output  10

public class Question17 {

    static int nTerm(int n) {
        int t = (n * (n + 1)) / 2;
        return t;
    }

    public static void main(String[] args) {
        System.out.println(nTerm(0));
    }
}
