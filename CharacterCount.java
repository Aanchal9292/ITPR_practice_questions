package Project1;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            // Count how many times this character appears
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // Print only first time (avoid duplicate printing)
            if (str.indexOf(ch) == i) {
                System.out.println(ch + " : " + count);
            }
        }
    }
}
