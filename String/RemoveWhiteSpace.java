public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str="  J  a  v  a  ";
        String result=RemoveWhiteSpace1(str);
        System.out.println(result);
    }
    public static String RemoveWhiteSpace1(String str)
    {
    return str.replaceAll("\\s+","");
    }
}

/*String result=str.replaceAll("\\s+", "");
        System.out.println(result); */