package algorithms;

import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursiveBinarySearch {

    public static void main(String[] args) {

        int[] list = {0,1,2,3,4,5,6,7,8,9};
        int target;

        try {
            System.out.println("Enter target number : ");
            Scanner temp = new Scanner(System.in);
            target = temp.nextInt();
            recursive_binary_search(list, target);
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong type entered. Please enter an integer");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static boolean recursive_binary_search(int[] list, int target) throws ArrayIndexOutOfBoundsException {
        int midpoint;

        if (list.length == 0) {
            System.out.println("Target not found");
            return false;
        } else {
            midpoint = Math.floorDiv(list.length, 2);
            if(list[midpoint]== target) {
                System.out.println("target #: " + target + " found");
                return true;
            } else if (target < list[midpoint]) {
                list = Arrays.copyOfRange(list,0, midpoint);
                return recursive_binary_search(list,target);
            } else if (target > list[midpoint]) {
                list = Arrays.copyOfRange(list, midpoint + 1, list.length);
                return recursive_binary_search(list,target);
            } else {
                return false;
            }
        }
    }
}
