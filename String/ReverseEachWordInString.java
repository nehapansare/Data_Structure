public class ReverseEachWordInString {
    public static void main(String[] args) {
        String str="Hello World";
        String[] word1=str.split(" ");
        String result="";
        for(int i=0;i<word1.length;i++)
        {
            String word = word1[i];
            String reverse="";
        for(int j=word.length()-1;j>=0;j--)
        {
            reverse+=word.charAt(j);
        }
        result+=reverse+" ";
        }
        result=result.trim();
        System.out.println(result);

    }
}
