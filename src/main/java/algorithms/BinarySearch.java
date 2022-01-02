package algorithms;

import java.util.ArrayList;

public class BinarySearch {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        int target = 1;
        int result;
        int sizeOfArray = 10;

        for(int i = 0; i < sizeOfArray; i++) {
            list.add(i);
        }

        result = binary_search(list, target);
        verify(result);

    }

    // List MUST be sorted for binary search else may return not found even though target exists.
    public static int binary_search(ArrayList list, int target) {
        int first = 0;
        int last = list.size() -1;
        int midpoint;

        while(first <= last) {
            midpoint = Math.floorDiv(first + last , 2);
            if ( (Integer)list.get(midpoint) == target ){
                return midpoint;
            } else if ((Integer)list.get(midpoint) < target) {
                first = midpoint + 1;

            } else if ((Integer)list.get(midpoint) > target) {
                last = midpoint - 1;
            }
        }
        return -1;
    }

    public static void verify(int result) {
        if(result != -1) {
            System.out.println("Target found at position : " + result);
        } else {
            System.out.println("Target not found in list");
        }
    }
}
