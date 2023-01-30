package Collections_Demo.ListDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Ex {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println(fruits);
        fruits.remove("orange");
        System.out.println("List after removing orange " + fruits);
        System.out.println("Size of list " + fruits.size());
        fruits.set(2,"Kiwi");
        System.out.println("Updated list : " + fruits);
        System.out.println("Is list contains mango? " + fruits.contains("Mango"));
    }
}
