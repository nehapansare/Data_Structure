package Patterns.Character;

public class LeftAngleTriangle {
    public static void main(String[] args) {
        char ch='A';
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println( );
            
        }
    }
}
