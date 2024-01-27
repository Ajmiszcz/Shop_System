import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BackOffice {
    private Map<String, List<Product>> productsByCategory;
    List<Double> discounts;
    private List<Cart> finishedCarts;

    public BackOffice() {
        this.productsByCategory = new HashMap<>();
        this.discounts = new ArrayList<>();
        this.finishedCarts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productsByCategory.computeIfAbsent(product.getCategory(), k -> new ArrayList<>()).add(product);
    }

    public void addDiscount(double discount) {
        discounts.add(discount);
    }

    public void finishOrder(Cart cart, double discount) {
        Order order = new Order(cart.getProducts(), discount);
        finishedCarts.add(cart);
        cart.clear();
        System.out.println("Order finished: " + order);
    }
}