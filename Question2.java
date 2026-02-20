// Write a program to reverse digits of a number
// Given an Integer n, find the reverse of its digits.

// Examples:  

// Input: n = 122
// Output: 221
// Explanation: By reversing the digits of number, number will change into 221.

// Input: n = 200
// Output: 2
// Explanation: By reversing the digits of number, number will change into 2.

// Input: n = 12345 
// Output: 54321
// Explanation: By reversing the digits of number, number will change into 54321.

public class Question2 {
    public static int rev(int n, int revN){
        if(n==0) return revN;
        revN = revN*10 + (n%10);
        return rev(n/10, revN);    
    }
    public static void main(String[] args) {
        System.out.print(rev(122, 0));
        
    }
}
