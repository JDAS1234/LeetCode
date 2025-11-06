/*
 *  Number sequence question
    You are given a set a numbers give me the length of the largest sequence of numbers going higher than lower without breaking the chain
    Example 
    1 4 5 3 7 8 9 10
    1,4,5,3 is one chain
    3,7,8,9,10 is another chain and is larger
    Return the size of the larger chain
 */

import java.util.Scanner;

public class ChainFinder {

    public static int findLongestChain(String input) {

        int chain = 1;
        int longestChain = 0;
        boolean flagLow = false;

        String[] parts = input.split(" ");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            try {
                numbers[i] = Integer.parseInt(parts[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: '" + parts[i] + "' is not a number.");
                return -1;
            }
        }

        if (numbers.length == 0) {
            return 0;
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            {
                if (numbers[i] < numbers[i + 1]) {
                    if (flagLow) {
                        if (chain > longestChain)
                            longestChain = chain;
                        chain = 1;
                        flagLow = false;
                    }
                    chain++;
                } else if (numbers[i] > numbers[i + 1]) {
                    chain++;
                    flagLow = true;
                }
            }
        }

        if (chain > longestChain)
            longestChain = chain;

        return longestChain;

    }

    public static void main(String[] args) throws Exception {

        String input = "";
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a sequence of numbers separated by spaces (type quit to exit): ");
                input = scanner.nextLine();

                if (input.equals("quit")) {
                    break;
                }

                if (input.isEmpty()) {
                    System.out.println("Please enter something.");
                    continue;
                }

                if (findLongestChain(input) != -1)
                    System.out.println("Longest chain is " + findLongestChain(input) + " numbers long");

            }
        }

    }
}
