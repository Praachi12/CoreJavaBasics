package Collections_Demo.Map_Ex;

import Practice_Assignment_InheritanceAndPolymorphism.TestMonster;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Ex {
    public static void main(String[] args) {
        Map<Integer, String> employee = new TreeMap<>();
        employee.put(1, "Komal");
        employee.put(2, "Shivani");
        employee.put(3, "Parth");
        employee.put(7, "Isha");
        System.out.println(employee);
        employee.replace(2, "jaya");
        System.out.println(employee);
        //employee.put(null, "Siya");
        System.out.println(employee);




    }
}
