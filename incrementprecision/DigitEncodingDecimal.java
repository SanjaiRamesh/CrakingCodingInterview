package incrementprecision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

// Write a program which takes as input an array of digits encoding a decimal number D and updates the array to represent the number D+1.
// example if the input arrays is {1,2,9}, then you should update array to {1,3,0}
public class DigitEncodingDecimal {

    private static List<Integer> plusOne(List<Integer> input) {
        if(Objects.isNull(input) || input.isEmpty()) {
            return Collections.emptyList();
        }
        int n = input.size();
        input.set(n-1, input.get(n-1)+1);

        for( int i = n-1; i>0 && input.get(i)==10; i--) {
            input.set(i, 0);
            input.set(i-1, input.get(i-1)+1);
        }
        if(input.get(0)==10) {
            input.set(0,0);
            input.add(0,1);
        }
        return input;
    }

    public static void main(String[] args) {
        //Case 1
        List<Integer> input = new ArrayList<>(List.of(1,2,9));
        System.out.println(input);
        System.out.println(plusOne(input));
        // Case 2
        List<Integer> input1 = new ArrayList<>(List.of(9,9,9));
        System.out.println(input1);
        System.out.println(plusOne(input1));
    }
}
