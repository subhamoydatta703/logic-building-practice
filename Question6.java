// Given three sides, check whether triangle is valid or not.

// Examples:

// Input :  a = 7, b = 10, c = 5
// Output : Valid
// We can draw a triangle with the given three edge lengths.

// Input : a = 1, b = 10, c = 12
// Output : Invalid
// We can not draw a triangle with the given three edge lengths.

// Approach: A triangle is valid if sum of its two sides is greater than the third side. 
// If three sides are a, b and c, then three conditions should be met. 

// (a + b) > c
// (a + c) > b
// (b + c) > a

public class Question6 {
    static boolean isValidTriangle(int a, int b, int c) {
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        boolean val = isValidTriangle(7, 10, 5);
        if (val)
            System.out.println("Valid");
        else
            System.out.print("Invalid");
    }
}
