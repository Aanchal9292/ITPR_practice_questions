package Project1;   // Package Declaration
import java.util.Scanner;

public class OddFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();   // to avoid resource leak

        System.out.println("Odd factors are:");
        // Loop from 1 to the given number
        for (int i = 1; i <= num; i++) {

            // Check if i is factor and odd
            if (num % i == 0 && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

