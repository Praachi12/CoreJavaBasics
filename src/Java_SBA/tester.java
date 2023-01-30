package Java_SBA;

import java.util.Scanner;

public class tester extends Exception{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;

        System.out.println("Enter your name : ");
        name = s.next();
        int i = 0;
        while (i != name.length()) {
            try {
                if (name.charAt(i) >= 97 && name.charAt(i) <= 122)
                {
                    i++;
                }
                else
                {
                    throw new Exception("Invalid String!");
                }
            } catch (Exception e) {
                System.out.println(e.toString());
                System.exit(0);
            }
        }
        System.out.println("String is lowercase");
        s.close();
    }

}
