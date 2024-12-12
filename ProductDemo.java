class Product {
    // instance Variables
    int productId;
    String productName;
    String productType;
    int productPrice;

    // instance Methods
    void productDetails() {
        System.out.println(
                "\nProduct Details: \n" + productId + ",\n" + productName + ",\n" + productType + ",\n" + productPrice);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.productId = 10020;
        product1.productName = "GTR";
        product1.productType = "Nissan Car";
        product1.productPrice = 3000000;
        product1.productDetails();
        
    }

}

