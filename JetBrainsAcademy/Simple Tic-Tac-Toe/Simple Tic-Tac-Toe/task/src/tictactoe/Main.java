package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String input = scanner.nextLine();
        char[][] board = fillBoard(input);
        printBoard(board);

        boolean isInputValid = false;
        int inputX = 0;
        int inputY = 0;
        while (!isInputValid) {
            System.out.print("Enter the coordinates: ");
            try {
                inputX = scanner.nextInt();
                inputY = scanner.nextInt();

                inputX--;
                inputY--;

                isInputValid = validateInput(board, inputX, inputY);
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("You should enter numbers!");
            }
        }

        addPlayerMove(board, inputX, inputY, 'X');
        printBoard(board);

        //printResult(board);
    }

    private static void addPlayerMove(char[][] board, int inputX, int inputY, char value) {
        board[inputX][inputY] = value;
    }

    private static boolean validateInput(char[][] board, int inputX, int inputY) {
        if (inputX < 0 || inputX > 3 || inputY < 0 || inputY> 3 ) {
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        } else if (board[inputX][inputY] != ' ') {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        }

        return true;
    }

    private static void printResult(char[][] board) {
        final int xVictory = 'X' + 'X' + 'X';
        final int oVictory = 'O' + 'O' + 'O';

        boolean xWins = false;
        boolean oWins = false;

        int countX = 0;
        int countO = 0;

        int[] lines = new int[3];
        int[] columns = new int[3];
        int[] diagonals = new int[2];

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                char value = board[x][y];

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
            System.out.println("Impossible");
        } else if (xWins) {
            System.out.println("X wins");
        } else if (oWins) {
            System.out.println("O wins");
        } else if (countO + countX == 9) {
            System.out.println("Draw");
        } else {
            System.out.println("Game not finished");
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println("---------");

        for (int x = 0; x < board.length; x++) {
            System.out.print("| ");

            for (int y = 0; y < board[x].length; y++) {
                System.out.print(board[x][y] + " ");
            }

            System.out.println("|");
        }

        System.out.println("---------");
    }

    private static char[][] fillBoard(String input) {
        char[][] board = new char[3][3];
        int x = 0, y = 0;

        for (int i = 0; i < input.length(); i++) {
            board[x][y] = input.charAt(i) == '_' ? ' ' : input.charAt(i);

            if ((i + 1) % 3 == 0) {
                x++;
                y = 0;
            } else {
                y++;
            }
        }

        return board;
    }
}
