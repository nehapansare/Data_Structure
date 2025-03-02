package Patterns.Character;

public class ReverseAlphabetPyramid {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            char ch='E';
            for(int k=1;k<=i;k++)
            {
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}
