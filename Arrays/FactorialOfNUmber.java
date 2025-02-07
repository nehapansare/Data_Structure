package Arrays;

public class FactorialOfNUmber {
    public static void main(String[] args) {
        int n=5;
        int fac=1;
        for(int i=1;i<=5;i++)
        {
            fac*=i;
        }
        System.out.println("Factorial Of"+" "+n+" "+"is:"+fac);
    }
}
