package Problem;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int a=sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int b=sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int c=sc.nextInt();

        if (a == b && b == c && c == a){
            System.out.println("None of the department has got the highest placement");
          }
          else if (a == b && a > c){
            System.out.println ("Highest Placement:");
            System.out.println ("CSE");
            System.out.println ("ECE");
          }
        else if (a == c && a > b){
            System.out.println ("Highest Placement:");
            System.out.println ("CSE");
            System.out.println ("MECH");
          }
        else if (b == c && b > a) {
            System.out.println ("Highest Placement:");
            System.out.println ("ECE");
            System.out.println ("MECH");
          }
        if(a>b && a>c )
        {
           System.out.print("Highest Placement:\n");
            System.out.print("CSE\n");
        }
        else if(b>c && b>a)
        {
            System.out.println ("Highest Placement:");
	    System.out.println ("ECE");
        }
        else{
            System.out.println ("Highest Placement:");
            System.out.println ("MECH");
          }
    }
}
