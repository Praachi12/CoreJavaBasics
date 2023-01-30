package Collections_Demo.Map_Ex;

import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {


        Map<Integer, String> studentMarks = new java.util.LinkedHashMap<>();
        studentMarks.put(90, "ABC");
        studentMarks.put(95, "XYZ");
        studentMarks.put(98, "PQR");
        System.out.println(studentMarks);
        System.out.println( studentMarks.entrySet());
        studentMarks.put(null,"Sayali");
        studentMarks.put(null,"Siya");//Allows only one null key
        System.out.println(studentMarks);

    }
}
