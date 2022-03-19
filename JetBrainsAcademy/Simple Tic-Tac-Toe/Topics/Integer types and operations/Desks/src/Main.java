import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfChairs = 0;
        while (scanner.hasNext()) {
            int students = scanner.nextInt();
            numOfChairs += Math.round(students / 2.0f);
        }

        System.out.println(numOfChairs);

    }
}