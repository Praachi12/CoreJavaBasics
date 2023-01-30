package Practice_Assignment_Loops;

public class Multiplication_Table
{
    public static void main(String[] args) {
        for (int i =1;i<13; i++)
        {
            System.out.println(" " + i + " ");
            for(int j = 1; j<11 ; j++)
            {
                System.out.println(i*j);
            }
        }
    }
}
