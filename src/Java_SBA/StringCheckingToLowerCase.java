package Java_SBA;

public class StringCheckingToLowerCase extends Exception {
    public StringCheckingToLowerCase(String s) {
        // Call constructor of parent Exception
        super(s);
    }
   /* public void stringCheck(String s)
    {

    }*/

    public static void main(String[] args) {


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

