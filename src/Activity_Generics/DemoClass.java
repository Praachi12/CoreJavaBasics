package Activity_Generics;

public class DemoClass {
    public <T> void genericMethod(T data)
    {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}
