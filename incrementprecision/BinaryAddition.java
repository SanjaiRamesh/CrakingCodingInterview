package incrementprecision;

import java.util.Objects;

/*
Write a program which takes as input two strings S and T of bits encoding
binary number Bs and Bt, respectively, and return a new string of bits representing
the number Bs+Bt
 */
public class BinaryAddition {

    public static String binaryStrAddition(String S, String T) {
        if(Objects.isNull(S)|| S.isEmpty()) {
            return T;
        }
        if(Objects.isNull(T)|| T.isEmpty()) {
            return S;
        }
        int i = S.length()-1;
        int j = T.length()-1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(i>=0 || j>=0) {
            int sum = carry;
            if(i>=0) {
                sum += S.charAt(i) - '0';
            }
            if(j>=0) {
                sum += T.charAt(j) - '0';
            }
            if(sum == 0 || sum ==1) {
                result.append(sum);
                carry=sum;
            } else if( sum == 2) {
                result.append(0);
                carry = 1;
            } else {
                result.append(1);
                carry = 0;
            }
            i--;
            j--;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String S1 = "101";
        String T1 = "101";
        System.out.println(binaryStrAddition(S1, T1));
    }

}
