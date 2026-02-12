import java.util.ArrayList;
import java.util.List;
class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void displayProduct() {
        System.out.println("Product: " + name + " | Price: Rs." + price);
    }
}
class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
    }
    public void removeProduct(String productName) {
        Product toRemove = null;
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                toRemove = product;
                break;
            }
        }
        if (toRemove != null) {
            products.remove(toRemove);
            System.out.println(productName + " removed from cart.");
        } else {
            System.out.println("Product not found in cart.");
        }
    }
    public double calculateTotalCost() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;
    }
    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("\nShopping Cart ");
        for (Product product : products) {
            product.displayProduct();
        }
        System.out.println(" ");
        System.out.println("Total Cost: Rs." + calculateTotalCost());
    }
}

public class scenario3 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Headphones", 2500);
        Product p3 = new Product("Mouse", 800);
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.displayCart();
        System.out.println("\nRemoving Headphones");
        cart.removeProduct("Headphones");
        cart.displayCart();
    }
}
