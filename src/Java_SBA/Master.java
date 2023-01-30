package Java_SBA;
import java.util.ArrayList;
public class Master {
    public static void main(String[] args)
        {
            // Creating an ArrayList Object of Integer type
            ArrayList<Integer> list = new ArrayList<>();

            // Inserting some Integer values in ArrayList
            list.add(3);
            list.add(57);
            list.add(7);

            //Create Empty String ArrayList
            ArrayList<String> arrayToArrayList = new ArrayList<String>();

            //Create String Array
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

            //1 Create array with method
            ArrayList<Integer> listx= Master.createArrayWithData();

            // 2 add empty space to array using object.set(arrayIndex, "")
            addEmptySpace(listx);


            // 3 remove empty space using equal method and writing data to new array
            removeEmptySpace(listx);

            // 4 arrayToArrayListConverter
            arrayToArrayListConverter(arrayToArrayList,cars);
            // 5 Validator arrayToArrayListConverter
        }





        public static ArrayList<Integer> createArrayWithData()
        {
            ArrayList<Integer> list = new ArrayList<Integer>();

            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);

            return list;
        }
        // Function to display the array List
        public static void addEmptySpace(ArrayList<Integer> list)
        {
            System.out.println(list);
        }

        // Function to modify the arrayList
        public static void
        removeEmptySpace(ArrayList<Integer> parameterList)
        {
            parameterList.add(20);
            parameterList.add(98);
        }

        public static void arrayToArrayListConverter(ArrayList<String> list,String[] someStringArray)
        {
            for(int i = 0; i < someStringArray.length; i++)
            {
                list.add(someStringArray[i]);
                System.out.println("I have added the string: "+someStringArray[i]+" at the index: "+i);
            }
        }


    }


