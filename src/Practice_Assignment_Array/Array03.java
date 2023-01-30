package Practice_Assignment_Array;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {
        String[] colors = {"red","green","blue","yellow"};
        System.out.println("Length of an array is :" + colors.length);
        String[] newcolors = colors.clone();
        System.out.println("Result after clone method" + Arrays.toString(newcolors));
        //Arrays.toString(newcolors);
    }
}
