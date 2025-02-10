public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean result=isValid(str);
        System.out.println("Is valid palindrome: " + result);

    }
    public static boolean isValid(String str) {
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            while(i<j && !Character.isLetterOrDigit(str.charAt(i)))
            {
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(str.charAt(j)))
            {
                j--;
            }
            if(Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(str.charAt(j)))
            {
                return false;
            }
            i++;
            j--;
        }
         return true;
      

        
    }
}
