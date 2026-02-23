// Given a non negative number n, the task is to convert the given number into an equivalent binary representation.

// Examples:

// Input: n = 12
// Output: "1100"
// Explanation: the binary representation of 12 is "1100", since 12 = 1×23 + 1×22 + 0×21+ 0×20 = 12

// Input: n = 33
// Output: "100001"
// Explanation: the binary representation of 33 is "100001", since  1×25 + 0×24 + 0×23 + 0×22 + 0×21 + 1×20  = 33

public class Question16 {
    // using StringBuilder as parameter
    static StringBuilder decToBin(int n, StringBuilder newStr) {

        if (n == 0) {
            // System.out.println(0);
            newStr.append("0");
            return newStr;
        }

        while (n > 0) {
            // System.out.println(n%2);
            newStr.append(n % 2);
            n = n / 2;
        }
        return newStr.reverse();

    }

    // without StringBuilder as parameter
    static String decToBin(int n) {

        if (n == 0)
            return "0";
        StringBuilder str = new StringBuilder();

        while (n > 0) {
            str.append(n % 2);
            n = n / 2;
        }
        str.reverse();
        return str.toString();

    }

    public static void main(String[] args) {
        // System.out.println(decToBin(13, new StringBuilder("")));
        System.out.println(decToBin(13));
    }
}
