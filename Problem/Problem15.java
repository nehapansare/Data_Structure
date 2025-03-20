package Problem;

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0))
        {
            System.out.println("leap year");
        }
        else{
            System.out.println("Is not leap year");
        }

    }
}
