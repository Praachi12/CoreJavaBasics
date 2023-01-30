package Java_SBA;


    public class Main
    {
        public static void main(String[] args)
        {
            int agesOfPassengers[] = {20, 22, 51, 48, 37, 29, 30, 42, 62,29, 30,};

            AirlineSeat northwestAirline=new AirlineSeat();
            northwestAirline.calculatePassengersAvgAge(agesOfPassengers);
            northwestAirline.transitPassengers(5);
            northwestAirline.transitPassengers(5);


        }
    }

