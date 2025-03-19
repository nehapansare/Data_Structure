package Problem;
import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int M=sc.nextInt();
       int N=sc.nextInt();
       int sum=0;
       for(int i=M;i<=N;i++)
       {
        if(isprime(i))
        {
           sum+=i;
           System.out.println(i);
        }
       }
       System.out.println(sum);
     
    }
    public static boolean isprime(int num)
    {
        if(num<2) return false;
        for(int i=2;i<Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

}
