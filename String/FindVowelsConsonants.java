public class FindVowelsConsonants {
    public static void main(String[] args) {
        String str="Hello World";
        int vowelsCount=0;
        int consonantsCount=0;
        for(int i=0;i<str.length();i++)
        {
          
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ) 
            {
                vowelsCount++;
            }
            else{
                consonantsCount++;
            }
        }
        }
        System.out.println("Vowel Count"+" "+vowelsCount);
        System.out.println("Consonants Count"+" "+consonantsCount);
    }
}
