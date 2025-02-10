import java.util.Arrays;

public class Anagrams {
   public static void main(String[] args) {
     String str1="keep";
     String str2="loep";
     boolean result=isAnagram(str1, str2);
     if(result)
     {
        System.out.println("Anagrams");
     }
     else{
            System.out.println("Not Anagrams");
     }

   } 
   public static boolean isAnagram(String str1, String str2)
   {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        char[] s1=str1.toCharArray();
        char[] s2=str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s1);
        return Arrays.equals(s1, s2);



   }
}
