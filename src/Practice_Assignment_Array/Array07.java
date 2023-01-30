package Practice_Assignment_Array;

public class Array07 {

    public static void main(String[] args) {
        String[] cart = {"milk", "rice","butter","bread","jam" };
        String x= "";
        System.out.println("cart before swapping :");
        for(int i=0; i < cart.length; i++)
        {
            System.out.println(cart[i]);
        }
        x=cart[0];
        cart[0] = cart[2];
        cart[2] = x;
        System.out.println("Cart after swapping : " );
        for(int j=0; j < cart.length; j++)
        {
            System.out.println(cart[j]);
        }


    }
}
