package duke.choice;

public class Customer {
    private String name;
    private String size;
    private Clothing[] items;

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4: case 5: case 6:
                setSize("M");
                break;
            case 7: case 8: case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }

    public Clothing[] getItems() {
        return items;
    }

    public void setItems(Clothing[] items) {
        this.items = items;
    }

    public double getTotalClothingCost() {
        double total = 0.0;
        for (Clothing item : getItems()) {
            total += item.getPrice();
        }

        return total;
    }

    public void printAveragePrice() {
        int numberOfItems = 0;
        int average = 0;
        for (Clothing item : getItems()) {
            if (item.getSize().equalsIgnoreCase("L")) {
                numberOfItems++;
                average += item.getPrice();
            }
        }

        try {
            average = numberOfItems == 0 ? 0 : (average / numberOfItems);
            System.out.println("The average price is: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by 0");
        }
    }
}
