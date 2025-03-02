package Patterns.Character;

public class HollowAlphabetPyramid {
    public static void main(String[] args) {
        char ch='A';
        int row=5;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                if (i == 1 || i == row || k == 1 || k == i) {
                    System.out.print(ch + " ");
                } else {
                    System.out.print("  "); 
                }
                
            }
            System.out.println();
            ch++;
        }
    }
}
