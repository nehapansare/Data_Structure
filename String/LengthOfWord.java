public class LengthOfWord {
    public static void main(String[] args) {
        String str="Hello World";
        int count=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if (str.charAt(i) != ' ')
            {
                count++;
            }
            else{
                break;
            }
        }
        System.out.println("Last Word Length:"+count);
    }
}
