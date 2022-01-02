package algorithms;

import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        int target = 5;
        int result;
        int sizeOfArray = 10;

        for(int i = 0; i < sizeOfArray; i++) {
            list.add(i);
        }

        result = linear_search(list, target);
        verify(result);

    }


    // List does not need to be sorted for linear search.
    public static int linear_search(ArrayList list, int target) {
        for(int i = 0; i < list.size(); i++) {
            if((Integer)list.get(i) == target) {
                return i;
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
