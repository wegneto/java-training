package duke.choice;

public class ShopApp {

    public static void main(String[] args) {
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");

        System.out.println("Hello " + c1.getName() + ".");

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        Clothing[] items = {item1, item2, item3, item4};

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        item3.setDescription("Green Scarf");
        item3.setPrice(5);
        item3.setSize("S");

        item4.setDescription("Blue T-Shirt");
        item4.setPrice(10.5);
        item4.setSize("S");

        int measurement = 3;
        c1.setSize(measurement);

        for (Clothing item : items) {
            if (c1.getSize().equalsIgnoreCase(item.getSize())) {
                System.out.println("Item: " + item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
                total += item.getPrice();
            }

            if (total > 15) {
                break;
            }
        }

        System.out.println("Total is: " + total);
    }
}
