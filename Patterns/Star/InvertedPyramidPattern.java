package Patterns.Star;

public class InvertedPyramidPattern {
    public static void main(String[] args) {
        for(int i=4;i>=1;i--)
        {
            for(int k=1;k<=4-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
