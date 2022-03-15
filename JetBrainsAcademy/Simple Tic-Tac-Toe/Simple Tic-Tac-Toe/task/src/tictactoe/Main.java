package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String input = scanner.nextLine();

        System.out.println("---------");
        String line = "";
        for (int i = 0; i < input.length(); i++) {
            line = line + input.charAt(i) + " ";

            if ((i + 1) % 3 == 0) {
                System.out.printf("| %s|\n", line);
                line = "";
            }
        }
        System.out.println("---------");
    }
}
