package lt.sda.javafundamentals.store;

public class Cart {
    private  float sum = 0;

    public void addProduct(Product product){
     sum += product.getProductPrice();
    }

    public float getTotalSum() {
        return sum;
    }
}
