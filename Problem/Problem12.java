package Problem;
import java.util.*;
public class Problem12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        String input2=sc.nextLine();
        String output=input1.substring(input2.length());
        //String output=input1.replaceFirst(input2, "");
        System.out.println(output);
    }
}
