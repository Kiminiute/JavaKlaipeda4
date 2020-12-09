package lt.sda.javafundamentals.store;

public class Product {

    String productName;
    float productPrice = 0.0f;
    int productQuantity = 0;

    public Product(String productName, float productPrice){
    }

    public float setProductPrice() {
        return productPrice;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductName(String productName){}

    public String getProductName(String productName){
        return productName;
    }

    }


