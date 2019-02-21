import java.util.HashMap;
import java.util.*;
import java.util.Vector;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart(){}

    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void  addItem(Item item){
        this.items.add(item);
    }
    public void deleteItem(Item item){
        this.items.remove(item);
    }
}
