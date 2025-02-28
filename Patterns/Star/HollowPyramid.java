package Patterns.Star;

public class HollowPyramid {
    public static void main(String[] args) {
        int n = 4; 

        for (int i = 1; i <= n; i++) {
        
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print("* "); 
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}
