import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    private String name;
    public WarehouseItem(String name) { this.name = name; }
    public String getName() { return name; }
    @Override public String toString() { return name; }
}
class Electronics extends WarehouseItem { public Electronics(String name) { super(name); } }
class Groceries extends WarehouseItem { public Groceries(String name) { super(name); } }
class Furniture extends WarehouseItem { public Furniture(String name) { super(name); } }

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public List<T> getItems() { return items; }
}

public class WarehouseSystem {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println("Item: " + item.getName());
        }
    }

    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));
        
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple"));

        System.out.println("Electronics in Storage:");
        displayItems(electronicsStorage.getItems());
        
        System.out.println("Groceries in Storage:");
        displayItems(groceriesStorage.getItems());
    }
}
