public class CountVowlesInString {
    public static void main(String[] args) {
        String str="Hello";
        int left=0;
        int right=2;
        int result=CountVowles(str, left, right);
        System.out.println(result);

    }
    public static int CountVowles(String str,int left,int right)
    {
        int count=0;
        for(int i=left;i<=right;i++)
        {
            char ch=str.charAt(i);
            if(isVowles(ch))
            {
                count++;
            }

        }
        return count;
    }
    public static boolean isVowles(char ch){
        ch=Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
