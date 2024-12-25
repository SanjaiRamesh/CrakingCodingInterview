package groupingkey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupingBoolean {

private static List<Boolean> groupBoolean(List<Boolean> input) {

    int low=0,high=input.size()-1;
    if(high<=0) {
        return input;
    }
    while (low<high) {
        if(!input.get(low)) {
            Collections.swap(input, low, high--);
        } else {
            low++;
        }
    }
    return input;

}

public static void main(String[] args) {

        List<Boolean> booleanList = new ArrayList<>(List.of(Boolean.FALSE,Boolean.TRUE,Boolean.FALSE,Boolean.TRUE,Boolean.FALSE,Boolean.TRUE));
        System.out.println(booleanList);
        System.out.println(groupBoolean(booleanList));
    }
}
