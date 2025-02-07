package Arrays;

public class AmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int sum=0;
        int original=n;
        while(n>0)
        {
            int digit=n%10;
            sum+=digit*digit*digit;
            n=n/10;
        }
        if(original==sum)
        {
            System.out.println(original+" "+"amstrong number");
        }
        else{
        System.out.println(original+" "+"is not amstrong number");
        }
    } 
}
