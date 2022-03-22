package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] grid = new char[3][3];
        String result = null;
        int inputX = 0;
        int inputY = 0;
        char player = 'X';

        printGrid(grid);

        while (result == null) {
            System.out.print("Enter the coordinates: ");
            try {
                inputX = scanner.nextInt();
                inputY = scanner.nextInt();

                inputX--;
                inputY--;

                if (validateInput(grid, inputX, inputY)) {
                    addPlayerMove(grid, inputX, inputY, player);
                    printGrid(grid);
                    if (player == 'X') {
                        player = 'O';
                    } else {
                        player = 'X';
                    }
                    result = evaluate(grid);
                }
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("You should enter numbers!");
            }
        }

        System.out.println(result);
    }

    private static void addPlayerMove(char[][] board, int inputX, int inputY, char value) {
        board[inputX][inputY] = value;
    }

    private static boolean validateInput(char[][] board, int inputX, int inputY) {
        if (inputX < 0 || inputX > 2 || inputY < 0 || inputY> 2 ) {
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        } else if (board[inputX][inputY] != Character.MIN_VALUE) {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        }

        return true;
    }

    private static String evaluate(char[][] grid) {
        final int xVictory = 'X' + 'X' + 'X';
        final int oVictory = 'O' + 'O' + 'O';

        boolean xWins = false;
        boolean oWins = false;

        int countX = 0;
        int countO = 0;

        int[] lines = new int[3];
        int[] columns = new int[3];
        int[] diagonals = new int[2];

        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                char value = grid[x][y];

                if (value == 'X') {
                    countX++;
                } else if (value == 'O') {
                    countO++;
                }

                lines[x] += value;
                columns[y] += value;

                if (x - y == 0) {
                    diagonals[0] += value;
                }

                if (x + y == 2) {
                    diagonals[1] += value;
                }
            }
        }

        for (int line : lines) {
            if (line == xVictory) {
                xWins = true;
            } else if (line == oVictory) {
                oWins = true;
            }
        }

        for (int c : columns) {
            if (c == xVictory) {
                xWins = true;
            } else if (c == oVictory) {
                oWins = true;
            }
        }

        for (int d : diagonals) {
            if (d == xVictory) {
                xWins = true;
            } else if (d == oVictory) {
                oWins = true;
            }
        }

        if (xWins && oWins || (Math.abs(countX - countO) > 1)) {
            return "Impossible";
        } else if (xWins) {
            return "X wins";
        } else if (oWins) {
            return "O wins";
        } else if (countO + countX == 9) {
            return "Draw";
        }

        return null;
    }

    private static void printGrid(char[][] board) {
        System.out.println("---------");

        for (int x = 0; x < board.length; x++) {
            System.out.print("| ");

            for (int y = 0; y < board[x].length; y++) {
                char value = board[x][y] == Character.MIN_VALUE ? ' ' :  board[x][y];
                System.out.print(value + " ");
            }

            System.out.println("|");
        }

        System.out.println("---------");
    }
}
