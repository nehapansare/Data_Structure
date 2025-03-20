package Problem;

public class Problem9 {
    public static void main(String[] args) {
        int n=5;

        int a=1;int b=2;int total=a+b;
        for(int i=3;i<=n;i++)
        {
            int c=2*a*b;
            total+=c;
            a=b;
            b=c;
        }
        System.out.println(total);
    }
}
