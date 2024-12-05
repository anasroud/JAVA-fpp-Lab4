public class Furniture extends Product{
    private final String material;
    private final double shippingCost;

    public Furniture(String productName, double price, String material, double shippingCost) {
        this.material = material;
        this.shippingCost = shippingCost;
        this.productName = productName;
        setPrice(price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + shippingCost;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nMaterial: "+ material + "\n" + "Shipping Cost: " + shippingCost + "\nPrice After Shipping: " + this.getPrice());
    }
}
