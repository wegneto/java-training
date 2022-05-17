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
            case 1, 2, 3:
                setSize("S");
                break;
            case 4, 5, 6:
                setSize("M");
                break;
            case 7, 8, 9:
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
}
