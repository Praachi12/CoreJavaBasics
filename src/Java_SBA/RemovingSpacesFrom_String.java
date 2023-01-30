package Java_SBA;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
public class RemovingSpacesFrom_String extends Exception{

    ArrayList<String> list;
    public RemovingSpacesFrom_String(ArrayList<String> list)
    {
        this.list = list;
    }
    public RemovingSpacesFrom_String(String s) {
        // Call constructor of parent Exception
        super(s);
    }
    public static void main(String args[])
        {
            masterFunction();
            stringCheck();
        }
        static void masterFunction()
        {
            ArrayList<String> al = new ArrayList<String>();

            //Adding elements to the ArrayList
            al.add("my");
            al.add("");
            al.add("name");
            al.add("");
            al.add("is");
            al.add("prachi");

            System.out.println("ArrayList Elements are: al "+al);

            //Adding elements to a List
            List<String> list = new ArrayList<String>();

            for(int i = 0; i < al.size(); i++)
            {
                if(!al.get(i).equals(""))
                    list.add(al.get(i));
            }

            //Adding all elements of list to ArrayList using addAll

            System.out.println("Updated ArrayList Elements: "+list);
        }
    static void stringCheck()
    {
        String x = "XYZ";
        int size = x.length();
        int i = 0;
        while (i != size) {
            try {
                if (x.charAt(i) >= 97 && x.charAt(i) <= 122) {
                    i++;
                }
                else
                {
                    throw new StringCheckingToLowerCase("This is bad String");
                }
            }
            catch(StringCheckingToLowerCase ex)
            {
                System.out.println("Caught");
                // Print the message from MyException object
                System.out.println(ex.getMessage());
                System.exit(0);
            }
        }

        System.out.println("String is lowercase");
    }
    }





