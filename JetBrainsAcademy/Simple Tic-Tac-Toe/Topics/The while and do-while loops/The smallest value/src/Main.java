import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long input = scanner.nextLong();

        long n = 1;
        float result = input / n;

        while (result > 1) {
            n++;
            result = result / n;
        }

        if (input % n == 0) {
            n++;
        }

        System.out.println(n);
    }
}