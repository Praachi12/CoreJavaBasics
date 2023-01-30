package Java_SBA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListProgram2 {
/*List<String> names;
    public  ArrayListProgram2(int size)
    {

    }*/

    public static void display(List<String> t)
    {
        System.out.println("Cars: ");

        for (String car: t) {
            System.out.println(car);
        }
    }
    public static void main(String[] args) {
       String[] car_name = {"Tesla", "Honda", "BMW","Nissan", "audi","Hyundai"};
       //Converting array to arraylist

        ArrayList a1 = new ArrayList<>(Arrays.asList(car_name));

        //printing the new arraylist
        System.out.println(a1);

      // taking input from user
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cars = new ArrayList<>();

        // Read the names of cars from the user
        while (true) {
            System.out.print("Enter a name, empty will stop: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            cars.add(new String(name));
        }


        System.out.println();
        System.out.println("Cars in total: " + cars.size());
       //Iterating through an arraylist using display method
        display(cars);
    }

}
