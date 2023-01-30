package Collections_Demo.Map_Ex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer,String> employee = new HashMap<>();
        employee.put(1,"Komal");
        employee.put(2,"Shivani");
        employee.put(3,"Parth");
        employee.put(7,"Isha");
        System.out.println(employee);
        employee.replace(2,"jaya");
        System.out.println(employee);



    }
}
