package Problem;

public class Problem19 {
    public static void main(String[] args) {
        String str="Hello World";
        str=str.toLowerCase();
        int vowels = 0, consonants = 0, spaces = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            spaces++;
            else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels++;
            }
            else if (ch >= 'a' && ch <= 'z'){
                consonants++;
            }


        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Spaces: " + spaces);
        
    }
}
