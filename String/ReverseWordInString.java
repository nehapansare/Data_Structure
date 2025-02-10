public class ReverseWordInString {
    public static void main(String[] args) {
        String str="the sky is blue";
        str=str.trim();
        String[] word=str.split("\\s+");
        String result="";
        for(int i=word.length-1;i>=0;i--)
        {
             result+=word[i];
             if(i>0)
             {
                 result+=" ";
             }
        }
       System.out.println(result);

    }
}
