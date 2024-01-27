public class ShopSystem {
    public static void main(String[] args) {

        BackOffice backOffice = new BackOffice();

        Product product1 = new Product("Laptop", "Elektronika", 1000, 0.08, 0.1);
        Product product2 = new Product("Książka", "Książki", 20, 0.05, 0.2);
        backOffice.addProduct(product1);
        backOffice.addProduct(product2);

        backOffice.addDiscount(0.15);

        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        backOffice.finishOrder(cart, backOffice.discounts.get(0));
    }
}