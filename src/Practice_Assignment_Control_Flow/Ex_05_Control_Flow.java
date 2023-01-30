package Practice_Assignment_Control_Flow;

import java.util.Scanner;

public class Ex_05_Control_Flow {
    public static void main(String[] args) {
        System.out.println("Calculating Grades:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained:");
        int marks = sc.nextInt();

        if (marks >= 90 && marks<= 100 )
        {
            System.out.println(" Grade is  A");
        } else if (marks>=80 && marks<=89) 
        {
            System.out.println(" Grade B");
        } else if (marks >= 70 && marks <= 79) 
        {
            System.out.println("Grade C");
        } else if (marks >= 60 && marks<= 69) {
            System.out.println(" Grade D");
        } else if (marks < 60) {
            System.out.println("Grade F");
            
        }else {
            System.out.println("Score out of range");
        }
    }
}
