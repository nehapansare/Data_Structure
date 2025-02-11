public class ReplaceString {
    public static void main(String[] args) {
        String str="apples";
        char ch1='a';
        char ch2='p';
        String result="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
                
            if (c == ch1) {
                result += ch2; 
            } else if (c == ch2) {
                result += ch1; 
            } else {
                result += c; 
            }
        }
        System.out.println(result);
    }
}
