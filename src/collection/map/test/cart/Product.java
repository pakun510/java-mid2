package collection.map.test.cart;

import java.util.Objects;

public class Product {

    private String product;
    private int price;

    public Product(String product, int price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Product product1 = (Product) object;
        return price == product1.price && Objects.equals(product, product1.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}
