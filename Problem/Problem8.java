package Problem;
import java.util.*;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++)
        {
            sum+=i*10;
        }
        System.out.println(sum);
    }
}
