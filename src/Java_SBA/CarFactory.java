package Java_SBA;
import java.util.Arrays;

public class CarFactory {
    int[] carParkID;
    //int [] carPrices;

    public CarFactory(int no_of_cars)
    {
        carParkID = new int[no_of_cars];
        this.carParkID[0] = -1;
      //  Arrays.fill(carParkID, 1, carParkID.length, 3);
    }

    public static void valueOfCar(int[] carPrices)
    {
        int  value = 0;
        for(int i=0; i< carPrices.length; i++)
        {
            value = value+ carPrices[i];
        }
        System.out.println(value);
       int mean = value/carPrices.length;
       System.out.println(mean);
    }




    public static void main(String[] args) {
        CarFactory c1= new CarFactory(10);
        int [] carPrices = {1000, 2000,3000,4000};

        Arrays.fill(c1.carParkID, 1,6, 1);
        System.out.println("Array Elements");
        for(int data: c1.carParkID)
        {
            System.out.println(data);
        }
        System.out.println("Using toString method");
        System.out.println(Arrays.toString(c1.carParkID));
        c1.valueOfCar(carPrices);

    }

}
