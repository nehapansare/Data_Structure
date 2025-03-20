package Problem;

public class Problem10 {
    public static void main(String[] args) {
        int a=162;
        System.out.print(isdivisible(a));
    }
    public static boolean isdivisible(int a)
    {
        return a%9==0;
    }
}
