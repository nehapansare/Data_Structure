import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        Arrays.sort(str);
        String s1=str[0];
        String s2=str[str.length-1];
        int i=0;
        while(i<s1.length() && i<s2.length() && s1.charAt(i)==s2.charAt(i))
        {
            i++;
        }
        String result=s1.substring(0, i);
        System.out.println(result);


    }
}
