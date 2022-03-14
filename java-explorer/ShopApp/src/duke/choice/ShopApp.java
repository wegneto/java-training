package duke.choice;

public class ShopApp {

    public static void main(String[] args) {
        // write your code here
        double tax = 0.2;
        double total;

        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer();
        c1.name = "Pinky";
        System.out.println("Hello " + c1.name + ".");

        Clothing item1 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 20.9;

        System.out.println("Item 1: " + item1.description + ", " + item1.price + ", " + item1.size);

        Clothing item2 = new Clothing();
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        System.out.println("Item 2: " + item2.description + ", " + item2.price + ", " + item2.size);

        total = (item1.price + (item1.price * tax)) + ((2 * item2.price) + ((2 * item2.price) * tax));

        System.out.println("Total is: " + total);

    }
}
