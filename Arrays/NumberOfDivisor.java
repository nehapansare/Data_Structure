package Arrays;

public class NumberOfDivisor {
    public static void main(String[] args) {
        int n=12;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        System.out.print(count);
    } 
}
