import java.util.*;

class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return productName + " x" + quantity + " = "
                + (int)getTotal();
    }
}

class Order {
    private String orderId;
    private List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {

        double total = 0;

        for (Product p : products) {
            total += p.getTotal();
        }

        return total;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        result.append("Order ID: ").append(orderId).append("\n");
        result.append("Products:\n");

        for (Product p : products) {
            result.append(p).append("\n");
        }

        result.append("Total: ").append((int)calculateTotal());

        return result.toString();
    }
}

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String orderId = sc.nextLine();

        int n = Integer.parseInt(sc.nextLine());

        Order order = new Order(orderId);

        for (int i = 0; i < n; i++) {

            String[] data = sc.nextLine().split(",");

            Product p = new Product(
                    data[0].trim(),
                    Double.parseDouble(data[1].trim()),
                    Integer.parseInt(data[2].trim())
            );

            order.addProduct(p);
        }

        System.out.println(order);

        sc.close();
    }
}
