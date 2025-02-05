package Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=29;
        if(isprime(num))
        {
            System.out.print(num + " is a Prime Number");

        }
        else{
            System.out.print(num + " is not a Prime Number");

        }
    }
       public static boolean isprime(int num)
        {
            if(num<=1)
            {
                return false;
            }
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0)
                {
                    return false;
                }
            }
         return true;
        
    }
}
