package Arrays;

public class NumberOfPrimeDivisors {
    public static void main(String[] args) {
        int n=6;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0 && isPrime(i))
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int num)
    {
        if(num<2)
        {
            return false;
        }
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
