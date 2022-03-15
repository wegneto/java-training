import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int low = 0;
        final int high = 10;
        int n = scanner.nextInt();

        String msg = n > low && n < high ? "true" : "false";

        System.out.println(msg);
    }
}