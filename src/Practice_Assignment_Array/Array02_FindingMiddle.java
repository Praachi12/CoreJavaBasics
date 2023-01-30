package Practice_Assignment_Array;

public class Array02_FindingMiddle {
    public static void main(String[] args) {
        int[] arr = {13, 5, 7, 68, 2};
        int totalLength = arr.length / 2;
        System.out.println("Total Length of Array :" + arr.length + "\n");
        if (arr.length % 2 == 0) {
            System.out.println("Middle Element of array :" + arr[totalLength] + "  " + arr[totalLength - 1]);
        } else {
            System.out.println("Middle element " + arr[totalLength]);
        }

        }

    }

