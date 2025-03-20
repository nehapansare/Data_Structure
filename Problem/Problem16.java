package Problem;
import java.util.*;
public class Problem16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int digit=number%10;
        int firstsmall=digit;
        int lastlarge=digit;
        number/=10;

        while (number>0) {
            int digit1=number%10;
            if(digit1>lastlarge)
            {
                lastlarge=digit1;
            }
            if(digit1<firstsmall)
            {
                firstsmall=digit1;
            }
            number/=10;
            
        }
        System.out.println("Largest digit: " + lastlarge);
        System.out.println("Smallest digit: " + firstsmall);
    }
}
