import java.util.*;
abstract class items{
    int itemid;
    String name;
    double baseprice;
    public items(int itemid, String name, double baseprice) {
        this.itemid = itemid;
        this.name = name;
        this.baseprice = baseprice;
    }
    public int getid(){
        return itemid;
    }
    public String getname(){
        return name;
    }
    public double getbaseprice(){
        return baseprice;
    }
    public void displayItem() {
        System.out.println("Item ID: " + itemid);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + baseprice);
        System.out.println();
    }
}
class perishableitem extends items{
    private String expirydate;
    public perishableitem(int itemid, String name, double baseprice, String expirydate) {
        super(itemid, name, baseprice);
        this.expirydate = expirydate;
    }
    @Override
    public void displayItem() {
        super.displayItem();
        System.out.println("Expiry Date: " + expirydate);
        System.out.println();
    }
}
class electronic extends items{
    private int warrantyperiod;
    public electronic(int itemid, String name, double baseprice, int warrantyperiod) {
        super(itemid, name, baseprice);
        this.warrantyperiod = warrantyperiod;
    }
    @Override
    public void displayItem() {
        super.displayItem();
        System.out.println("Electronic Item ID: " + itemid + " Name: " + name + " Price: $" +
                         baseprice + " Warranty: " + warrantyperiod + " months");
        System.out.println();
    }
}
interface taxable {
    double calculatetax();
} 
public class d10 {
    private static HashMap<String, items> inventory = new HashMap<>();
    
    public static double calculatetax(items item) {
        if (item instanceof perishableitem) {
            return item.getbaseprice() * 0.05; 
        } else if (item instanceof electronic) {
            return item.getbaseprice() * 0.15; 
        }
        return 0.0;
    }
    
    public static void addItem(items item) {
        inventory.put(item.getname(), item);
    }

    public static void displayAllItems() {
        for (items item : inventory.values()) {
            item.displayItem();
        }
    }

    public static void searchItem(String name) {
        items item = inventory.get(name);
        if (item != null) {
            item.displayItem();
        } else {
            System.out.println("Item not found.");
        }
    }

    public static void calculateTotalValue() {
        double total = 0;
        for (items item : inventory.values()) {
            total += item.getbaseprice() + calculatetax(item);
        }
        System.out.printf("Total Inventory Value (Incl. Tax): $%.2f\n", total);
    }

    public static void sortByPrice() {
        ArrayList<items> list = new ArrayList<>(inventory.values());
        list.sort(Comparator.comparing(items::getbaseprice));

        System.out.println("\nItems Sorted By Price:");
        for (items item : list) {
            item.displayItem();
        }
    }

    public static void main(String[] args) {

        // Sample Input
        addItem(new perishableitem(1, "Milk", 2.50, "2026-03-10"));
        addItem(new electronic(2, "Headphones", 120.00, 24));

        displayAllItems();

        searchItem("Milk");

        calculateTotalValue();

        sortByPrice();
    }
}
