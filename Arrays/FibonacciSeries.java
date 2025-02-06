package Arrays;
public class FibonacciSeries {
    public static void main(String[] args) {
        int n=7;
        if(n==0)
        {
            System.out.print(0);
            return;
        }
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        int a=0;
        int b=1;
        int sum=0;
        for(int i=2;i<=n;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println(sum);


    }
}
