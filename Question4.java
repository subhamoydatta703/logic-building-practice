// Given two positive numbers x and y, check if y is a power of x or not.
// Examples : 

// Input:  x = 10, y = 1
// Output: True
// x^0 = 1

// Input:  x = 10, y = 1000
// Output: True
// x^3 = 1

// Input:  x = 10, y = 1001
// Output: False

public class Question4 {
    static boolean isCheck(int x, int y) {
        if (x == 1)
            return y == 1 ? true : false;
        if (y < 1)
            return false;
        while (y % x == 0) {
            y = y / x;
        }
        return y == 1 ? true : false;
    }

    public static void main(String[] args) {
        System.out.print(isCheck(10, 1001));
    }
}
