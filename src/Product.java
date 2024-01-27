class Product {
    private static int nextId = 1;
    private int id;
    private String name;
    private String category;
    private double price;
    private double tax;
    private double discount;

    public Product(String name, String category, double price, double tax, double discount) {
        this.id = nextId++;
        this.name = name;
        this.category = category;
        this.price = price;
        this.tax = tax;
        this.discount = discount;
    }

    public double calculateFinalPrice() {
        double discountedPrice = price - (price * discount);
        return discountedPrice + (discountedPrice * tax);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                ", discount=" + discount +
                '}';
    }

    public String getCategory() {
        return category;
    }
}
