package Problem;

import java.util.*;
public class Problem11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1:");
        int a=sc.nextInt();
        System.out.println("Enter number2:");
        int b=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++)
        {
            sum+=i;
        }
           System.out.println("Output is:"+sum);


    }
    
}
