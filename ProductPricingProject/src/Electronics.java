public class Electronics extends Product{
    private final int warranty;
    private final double warrantyCost;

    public Electronics(String productName, double price, int warranty, double warrantyCost) {
        super(productName, price);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice() {
        return warrantyCost + super.getPrice();
    }

    @Override
    public String toString() {
        return ( super.toString() + "\nWarranty duration: " + warranty + "\nWarranty cost: " + warrantyCost + "\nPrice With warranty: " + getPrice());
    }
}
