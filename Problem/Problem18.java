package Problem;

public class Problem18 {
    public static void main(String[] args) {
        int num=18;
        int sum=1;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
            sum+=i;
            }
        }
        System.out.println(num+" is abundant number "+(sum>num));
    }
}
