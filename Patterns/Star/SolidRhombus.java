package Patterns.Star;

public class SolidRhombus {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=4-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
