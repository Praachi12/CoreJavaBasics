package Java_SBA;


import java.util.ArrayList;
import java.util.Scanner;
public class SBAProgram1 extends Exception{
    public SBAProgram1(String s) {
        // Call constructor of parent Exception
        super(s);
    }
    ArrayList<String> arr;
    public SBAProgram1() {
        arr = new ArrayList<String>();
        arr.add("Our");
        arr.add("name");
        arr.add("are:");
        arr.add("Prachi");
        arr.add("Negasi");
        arr.add("Sioeli");
        arr.add("PerScholas");
        arr.add("Dallas");
        arr.add("California");
        arr.add("Irving");
        arr.add("Phoenix");
    }


    // static ArrayList<String> name = new ArrayList<String>();
    static ArrayList<String> name2 = new ArrayList<String>();

    public static void main(String[] args) {
        // RemoveSpacesFromArrayList obj = new RemoveSpacesFromArrayList();
        // RemoveEmptySpace();
        //  ValidString();
        SBAProgram1 obj = new SBAProgram1();
        System.out.println("ArrayElement");
        System.out.println("Array before adding spaces is" +obj.arr);
        obj.InsertEmptySpace(2);
        obj.InsertEmptySpace(5);
        obj.InsertEmptySpace(7);
        System.out.println("Array after adding spaces is" +obj.arr);
        //System.out.println("Array after removing spaces  is" +obj.arr);
        RemoveEmptySpace(obj.arr);
        System.out.println("Array after removing spaces  is" +name2);
        System.out.println("------------------------------------------");
        obj.ConvertArrayListIntoString();
    }
    public void InsertEmptySpace(int indexLocation)
    {
        arr.set(indexLocation,"");

    }
    public static void RemoveEmptySpace(ArrayList<String> arr)

    {

        for (int i = 0; i < arr.size(); i++) {
            if (!arr.get(i).equalsIgnoreCase(""))
                name2.add(arr.get(i));
        }
     //   System.out.println("The value before removing the spaces is:" + arr);
       // System.out.println("The value after removing the spaces is:" + name2);
    }
    public static void ValidString()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please enter the string");
        String str = sc.nextLine();
        int i = 0;

        while (i != str.length()) {
            try {

                if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {

                    i++;
                } else {
                    // Throw an object of user defined exception
                    throw new SBAProgram1("");

                }

            } catch (SBAProgram1 e) {
                //Print the message from MyException object
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }

        System.out.println("String is lower case");
    }
    public void ConvertArrayListIntoString()
    {
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            sb.append(s);
            sb.append("");
        }
        String str = sb.toString();
        System.out.println(str);
    }

}