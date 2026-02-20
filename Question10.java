// Given a number x, determine whether the given number is Armstrong's number or not. A positive integer of n digits is called an Armstrong number of order n (order is the number of digits) if

// abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....

// Here a, b, c and d are digits of input number abcd.....

// Examples

// Input: n = 153
// Output: true
// Explanation: 153 is an Armstrong number, 1*1*1 + 5*5*5 + 3*3*3 = 153

// Input: n = 9474
// Output: true
// Explanation: 94 + 44 + 74 + 44 = 6561 + 256 + 2401 + 256 = 9474

// Input: n = 123
// Output: false
// Explanation: 1³ + 2³ + 3³ = 1 + 8 + 27 = 36

public class Question10 {
    // method 1
    static boolean checkArmstrong(int n) {
        int p = 0;
        int num = n;
        String str = String.valueOf(num);
        int len = str.length();
        while (n > 0) {
            int t = n % 10;
            p = p + (int) Math.pow(t, len);
            n = n / 10;
        }
        if (num == p)
            return true;
        return false;

    }

    // method 2(better)
    static boolean isArmstrong(int n) {
        int p = 0;
        int temp = n;
        int num = n;
        int len = 0;
        while (temp > 0) {
            len++;
            temp = temp / 10;
        }
        while (n > 0) {
            int t = n % 10;
            p = p + (int) Math.pow(t, len);
            n = n / 10;
        }
        if (num == p)
            return true;
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(checkArmstrong(153));
    }
}
