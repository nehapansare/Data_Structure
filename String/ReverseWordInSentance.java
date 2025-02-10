public class ReverseWordInSentance {
    public static void main(String[] args) {
        String str="i like this program";
        String result="";
        String[] word=str.split("\\s+");
        for(int i=0;i<word.length;i++)
        {
            String currWord=word[i];
            String reverse="";
            for(int j=currWord.length()-1;j>=0;j--)
            {
                reverse+=currWord.charAt(j);
            }
            result+=reverse;
            if(i<word.length)
            {
                result+=" ";
            }
        }
        System.out.println(result);
    }
}
