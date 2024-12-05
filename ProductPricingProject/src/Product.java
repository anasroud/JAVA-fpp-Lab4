public class Product {
    public String productName;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product Name: " + productName + "\nPrice: " + price;
    }
}
