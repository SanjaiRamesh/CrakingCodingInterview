package groupingkey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupingSameKey {
    public enum COLOR{
        RED(1),
        WHITE(-2),
        BLUE(3);
        final int id;
        COLOR(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public static COLOR getColor(int value) {
            for(COLOR clr: COLOR.values()) {
                if(clr.getId() == value) {
                    return clr;
                }
            }
            return RED;
        }

    }
    private static List<Integer> groupSameKey(List<Integer> input) {

        int low=0,mid = 0, high=input.size()-1;
        if(high == 0){
            return Collections.emptyList();
        }
        while (mid <= high) {
            COLOR clr = COLOR.getColor(input.get(mid));
            if( clr == COLOR.RED) {
                Collections.swap(input, low++, mid++);
            } else if (clr == COLOR.WHITE) {
                mid++;
            } else {
                Collections.swap(input, mid, high--);
            }
        }
        return input;
    }

    public static void main(String[] args) {
        List<Integer> inputArray = new ArrayList<>(List.of(-2,3,1,-2,1,1,-2,3,-2));
        System.out.println(inputArray);
        System.out.println(groupSameKey(inputArray));
    }
}
