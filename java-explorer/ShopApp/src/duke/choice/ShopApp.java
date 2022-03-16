package duke.choice;

public class ShopApp {

    public static void main(String[] args) {
        double tax = 0.2, total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer();
        c1.name = "Pinky";
        c1.size = "S";

        System.out.println("Hello " + c1.name + ".");

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        Clothing[] items = {item1, item2, item3, item4};

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        item3.description = "Green Scarf";
        item3.price = 5;
        item3.size = "S";

        item4.description = "Blue T-Shirt";
        item4.price = 10.5;
        item4.size = "S";

        int measurement = 3;
        switch (measurement) {
            case 1, 2, 3:
                c1.size = "S";
                break;
            case 4, 5, 6:
                c1.size = "M";
                break;
            case 7, 8, 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }

        for (Clothing item : items) {
            if (c1.size.equalsIgnoreCase(item.size)) {
                System.out.println("Item: " + item.description + ", " + item.price + ", " + item.size);
                total += ((item.price) * (1 + tax));
            }

            if (total > 15) {
                break;
            }
        }

        System.out.println("Total is: " + total);
    }
}
