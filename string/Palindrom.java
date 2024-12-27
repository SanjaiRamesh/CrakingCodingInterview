package string;

public class Palindrom {
    public static boolean isPalindromic(String str) {
        int n = str.length();
        for(int i=0, j=n-1;i<j;i++,j--) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(str + " is palindromic? ans: "+ isPalindromic(str));
        str = "maddam";
        System.out.println(str + " is palindromic? ans: "+ isPalindromic(str));
        str = "string";
        System.out.println(str + " is palindromic? ans: "+ isPalindromic(str));
    }
}
