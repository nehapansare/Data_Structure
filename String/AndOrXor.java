public class AndOrXor {
    public static void main(String[] args) {
        String s1 = "1001";
        String s2 = "1010";

        System.out.println("AND: " + binary_and(s1, s2));
        System.out.println("OR:  " + binary_or(s1, s2));
        System.out.println("XOR: " + binary_xor(s1, s2));
    }

    public static String binary_and(String s1, String s2) {
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '1' && s2.charAt(i) == '1') {
                result += "1";
            } else {
                result += "0";
            }
        }
        return result;
    }

    public static String binary_or(String s1, String s2) {
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '1' || s2.charAt(i) == '1') {
                result += "1";
            } else {
                result += "0";
            }
        }
        return result;
    }

    public static String binary_xor(String s1, String s2) {
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
        
            if (s1.charAt(i) != s2.charAt(i)) {
                result += "1";
            } else {
                result += "0";
            }
        }
        return result;
    }
}
