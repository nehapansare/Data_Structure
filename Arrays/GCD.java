package Arrays;

public class GCD {
    public static void main(String[] args) {
        int num1=70;
        int num2=15;
        while(num2!=0)
        {
            int remainder=num1%num2;
            num1=num2;
            num2=remainder;
        }
        System.out.println(num1);
    }
}
