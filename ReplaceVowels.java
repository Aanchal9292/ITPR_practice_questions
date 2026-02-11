package Project1;

import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ("aeiouAEIOU".indexOf(ch) != -1) {
                result += "*";
            } else {
                result += ch;
            }
        }

        System.out.println("After Replacing Vowels: " + result);
    }
}
