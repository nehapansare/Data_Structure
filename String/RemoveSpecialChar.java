public class RemoveSpecialChar {
    public static void main(String[] args) {
        String str="@#J*&a$!@v*&a";
        String result=str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result);
    }
}

/*      String result=RemoveSpecialChar(str);
        System.out.println(result);
        
    }
    public static String RemoveSpecialChar(String str)
    {
        return str.replaceAll("[^a-zA-Z0-9]", "");

    } */