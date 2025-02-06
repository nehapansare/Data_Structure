package Arrays;

public class Palindrome {
    public static void main(String[] args) {
        int n=1221;
    
        int num=n;
        int rev=0;
        while(num>0)
        {
             int digit = num%10;
             rev=(rev*10)+digit;
             num=num/10;
        }
        if(rev==n)
        {
            System.out.println(n+" "+"is palindrome number");
        }
        else{
            System.out.println(n+" "+ "is not palindrome number");
        }

    }
}
