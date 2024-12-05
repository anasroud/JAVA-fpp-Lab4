public class TestClass {

    public static double sumProducts(Product[] col) {
        double price = 0;

        if (col != null) {
            for (Product product: col) {
                if (product != null) {
                    price += product.getPrice();
                }
            }
        }

        return price;
    }
    public static void main(String[] args) {
        Product adidas = new Clothing("Boots 240", 75, "Adidas", 20);
        Product computer = new Electronics("Gaming PC", 799, 12, 70);

        Product bag = new Clothing("Designer Bag", 1999, "LV", 50);
        Product playstation = new Electronics("PlayStation", 429, 12, 45);
        Product bed = new Furniture("Bed", 449, "Wood", 45);
        Product[] products = {adidas, computer, bag, playstation, bed};

        for (Product product: products) {
            System.out.println(product +  "\n");
        }

        System.out.println("Your Total Price is: " + sumProducts(products));
    }
}
