import java.util.List;

class Order {
    private static int nextId = 1;
    private int id;
    private List<Product> products;
    private double discount;

    public Order(List<Product> products, double discount) {
        this.id = nextId++;
        this.products = products;
        this.discount = discount;
    }

    public double calculateFinalPrice() {
        double totalPrice = products.stream().mapToDouble(Product::calculateFinalPrice).sum();
        return totalPrice - (totalPrice * discount);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                ", discount=" + discount +
                '}';
    }
}
