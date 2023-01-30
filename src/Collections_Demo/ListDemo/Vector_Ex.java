package Collections_Demo.ListDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Vector_Ex {
    public static void main(String[] args) {
        List<String> fruits = new Vector<>();
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
        fruits.addAll(3, fruits);
        System.out.println(fruits);
    }
}
