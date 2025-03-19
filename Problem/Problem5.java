/*Write a program that task 2 integer N&M as input and calculate the cube of all number in the range 
input N=2,M=4 output 99 explain 2^3+3^3+4^3=8+27+64=99 */

package Problem;
import java.util.Scanner;
public class Problem5 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first number:");
    int M=sc.nextInt();
    System.out.print("Enter last number:");
    int N=sc.nextInt();
    int sum=0;
    for(int i=M;i<=N;i++)
    {
        sum+=i*i*i;
    }
    System.out.print(sum);
   } 
}
