package Collections_Demo.Set_Practice;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Example {
    public static void main(String[] args) {
        Set<Integer> ids = new HashSet<>();
        ids.add(1022);
        ids.add(1023);
        ids.add(1024);
        ids.add(1025);
        System.out.println(ids);
        System.out.println("Is our set is empty? " + ids.isEmpty());
       // ids.clear();
        System.out.println(ids);
        System.out.println(ids.contains(1025));

    }
}
