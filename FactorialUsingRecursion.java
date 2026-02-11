package Project1;
import java.util.Scanner;

public class FactorialUsingRecursion {
// Recursive method to find factorial
    static long factorial(int n) {
        if (n == 0 || n == 1) 
        {  
        	
            return 1;
        } 
        else if (n < 0)
        {
            System.out.println("Factorial cannot be calculated for negative numbers");
            return -1;  // Return some value to avoid error
        }
        else {    // Recursive case
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long result = factorial(num);
        if(result != -1)
            System.out.println("Factorial of " + num + " is: " + result);

        sc.close();  // to avoid resource leak
    }
}
