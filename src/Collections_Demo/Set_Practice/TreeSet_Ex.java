package Collections_Demo.Set_Practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Ex {
    public static void main(String[] args) {
        Set<Integer> ids = new TreeSet<>();
        //TreeSet<Integer> sortedSet  = new TreeSet<>(ids);
        ids.add(1022);
        ids.add(1023);
        ids.add(1024);
        ids.add(1025);
        System.out.println(ids);
        System.out.println("Is our set is empty? " + ids.isEmpty());
        // ids.clear();
        System.out.println(ids);
        System.out.println(ids.contains(1025));
        ids.add(999);
        ids.add(1026);
        System.out.println(ids);
        TreeSet<Integer> sortedSet  = new TreeSet<>(ids);

            System.out.println("First element: " + sortedSet.first());
            System.out.println("Last element: " + sortedSet.last());


    }
}
