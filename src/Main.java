class MenuItem {
    private final String name;
    private final double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String toString() { return name + " ($" + price + ")"; }
}

class Order {
    private final MenuItem item;
    private final int quantity;

    public Order(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public double total() { return item.getPrice() * quantity; }
    public String toString() { return quantity + "x " + item + " = $" + total(); }
}

public class Main {
    public static void main(String[] args) {
        MenuItem pizza = new MenuItem("Pizza", 8.99);
        MenuItem pasta = new MenuItem("Pasta", 6.99);

        Order order1 = new Order(pizza, 2);
        Order order2 = new Order(pasta, 3);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println("Total: $" + (order1.total() + order2.total()));
    }
}
