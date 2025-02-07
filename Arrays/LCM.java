package Arrays;

public class LCM {
    public static void main(String[] args) {
        int num1=12;
        int num2=18;

        int a =num1;
        int b=num2;
        while(num2!=0)
        {
            int remainder=num1%num2;
            num1=num2;
            num2=remainder;
        }
        int gcd=num1;
        int lcm=(a*b)/gcd;
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
