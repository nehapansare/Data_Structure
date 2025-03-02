package Patterns.Character;

public class AlphabetPyramid {
    public static void main(String[] args) {
    char ch='A';
    for(int i=1;i<=5;i++)
    {
        for(int k=1;k<=5-i;k++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print(ch+" ");
          
        }
        System.out.println();
        ch++;
    }
}
}
