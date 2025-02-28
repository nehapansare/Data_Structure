package Patterns.Star;

public class HollowRhombhus {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=4-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=4;j++)
            {
                if(i==1||i==4||j==1||j==4)
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
