import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numberOfElements = scanner.nextInt();
        final int divisor = 6;
        int sum = 0;

        for (int i = 0; i < numberOfElements; i++) {
            int input = scanner.nextInt();
            if (input % divisor == 0) {
                sum += input;
            }
        }

        System.out.println(sum);
    }
}