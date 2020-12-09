package lt.sda.javafundamentals.store;

public class Store {

    private Product[] products;
    private Cart cart;
    private int productCount;


    public Store(int productCount) {
        this.products = new Product[productCount];
        this.productCount = productCount;
        this.cart = new Cart();
    }

    public void addProduct(String name, float price) {
    }

    public void listProducts(Product[] products) {
    }

    public void addToCart(int index) {
    }

    public void pay(Product totalSum) {
    }
}

