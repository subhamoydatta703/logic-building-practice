// Given two rectangles, find if the given two rectangles overlap or not.
// Note that a rectangle can be represented by two coordinates, top left and bottom right. So mainly we are given following four coordinates. 
// l1: Top Left coordinate of first rectangle.
// r1: Bottom Right coordinate of first rectangle.
// l2: Top Left coordinate of second rectangle.
// r2: Bottom Right coordinate of second rectangle.

// Examples:
// Input: l1 = { 0, 10 }, r1 = { 10, 0 }, l2 = { 5, 5 }, r2 = { 15, 0 }
// Output: Rectangles Overlap

// Input: l1 = { 0, 10 }, r1 = { 10, 0 }, l2 = { -10, 5 }, r2 = { -1, 0 }
// Output: Rectangles Don't Overlap

// condition: R1.x1 > R2.x2 || R2.x1 > R1.x2 -> false
// condition: R1.y1 < R2.y2 || R2.y1 < R1.y2 -> false

public class Question7 {

    static boolean doOverlap(Rectangle R1, Rectangle R2) {
        if (R1.x1 > R2.x2 || R2.x1 > R1.x2)
            return false;
        if (R1.y1 < R2.y2 || R2.y1 < R1.y2)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0, 10, 10, 0);
        Rectangle r2 = new Rectangle(5, 5, 15, 0);
        System.out.println(doOverlap(r1, r2));

    }
}

class Rectangle {
    int x1, y1, x2, y2;

    Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

}
