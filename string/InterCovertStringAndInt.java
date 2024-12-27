package string;

public class InterCovertStringAndInt {

    public static String intToString(int input) {
        boolean isNegative = input < 0;

        StringBuilder result = new StringBuilder();
        do {
            int a = Math.abs(input % 10);
            result.append(a);
            input /= 10;

        } while (input != 0);

        if(isNegative) {
            result.append("-");
        }

        return result.reverse().toString();
    }

    public static int stringToInt(String str) {

        int result = 0;
        for(int i = str.charAt(0) == '-'? 1: 0;i<str.length();i++) {
            int digit = str.charAt(i) - '0';
            result = result*10 + digit;
        }

        return str.charAt(0) == '-'? -result:result;
    }

    public static void main(String[] args) {

        System.out.println("int 123 converted to string :"+ intToString(123));
        System.out.println("int -123 converted to string :"+ intToString(-123));

        System.out.println("String 123 converted to int :"+ stringToInt("123"));
        System.out.println("String -123 converted to int :"+ stringToInt("-123"));
    }
}
