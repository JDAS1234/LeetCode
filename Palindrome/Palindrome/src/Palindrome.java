
/*Palindrome question 
See if the passed string is a palindrome the same backwards and forwards */
import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        String input = "";
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a word to see if it is a palindrome (type quit to exit): ");
                input = scanner.nextLine();

                if (input.equals("quit")) {
                    break;
                }

                if (input.isEmpty()) {
                    System.out.println("Please enter something.");
                    continue;
                }

                if (isPalindrome(input)) {
                    System.out.println("It is a palindrome.");
                } else {
                    System.out.println("It is not a palindrome.");
                }
            }
        }
    }

}
