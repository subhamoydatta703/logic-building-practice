// You are given two coordinates (x1, y1) and (x2, y2) of a two-dimensional graph. Find the distance between them.

// Examples: 

// Input : x1, y1 = (3, 4)
//            x2, y2 = (7, 7)
// Output : 5

// Input : x1, y1 = (3, 4) 
//            x2, y2 = (4, 3)
// Output : 1.41421
public class Question5 {
    static float shortestDist(float x1, float y1, float x2, float y2) {
        float p1 = (float) Math.pow((x1 - x2), 2), p2 = (float) Math.pow((y1 - y2), 2);
        return (float) Math.sqrt((p1 + p2));
    }

    public static void main(String[] args) {
        System.out.print(shortestDist(3, 4, 7, 7));
    }
}
