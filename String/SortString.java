import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str="Rock";
        char[] str1=str.toCharArray();
        Arrays.sort(str1);
        String result=new String(str1);
        System.out.println(result);
        
    }
}
