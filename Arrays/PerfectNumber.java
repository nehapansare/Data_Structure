package Arrays;
import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        for (int i = a; i <= b; i++)
        {
           
            if(isperfect(i))
            {
                sum+=i;
            }
        }
          System.out.println(sum);       
    }
    public static boolean isperfect(int num)
    {
        int sqrt=(int) Math.sqrt(num);
        return sqrt * sqrt == num; 

    }
    
}


