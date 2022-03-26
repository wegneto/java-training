package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = Integer.parseInt(scanner.next());

        System.out.println("Enter the number of seats in each row:");
        int seats = Integer.parseInt(scanner.next());

        Room room = new Room(rows, seats);
        int income = room.calculateIncome();
        System.out.printf("Total income:\n$%d", income);

        //System.out.println("Cinema:");
        //System.out.println(room);
    }
}

