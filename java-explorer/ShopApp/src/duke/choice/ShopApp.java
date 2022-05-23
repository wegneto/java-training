package duke.choice;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class ShopApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer("Pinky", 3);
        c1.setSize("S");

        System.out.println("Hello " + c1.getName() + ".");
        System.out.println("The minimum price is: " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5,"S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, item3, item4};
        c1.setItems(items);

        Arrays.sort(c1.getItems());
        for (Clothing item : c1.getItems()) {
            System.out.println(item);
        }

        System.out.println("Total: " + c1.getTotalClothingCost());
        c1.printAveragePrice();

        ItemList list = new ItemList(items);
        Routing routing = Routing.builder().get("/items", list).build();

        try {
            ServerConfiguration config = ServerConfiguration.builder().bindAddress(InetAddress.getLocalHost()).port(8888).build();

            WebServer ws = WebServer.create(config, routing);
            ws.start();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
