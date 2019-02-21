
import java.util.*;
import java.util.Vector;

public class Test {
    public static Bookstore marwin = new Bookstore("Marwin" ,100);
    public static Gamestore steam = new Gamestore("Steam",101);
    public static Shoestore kimex = new Shoestore("Kimex",110);
    public static void main(String args[]) {
        Mall ourMall = new Mall("Imperator");
        Database database= new Database();
        ArrayList<Item> ItemsFromDB = database.getItemsForStore("/Users/arman/Desktop/SELabWorks/SELabWork1/src/items.txt");
        ArrayList<Store> stores = new ArrayList<Store>();
        Item book1 = new Item("Alibaba",3,100,5.66);
        ArrayList<Item> marwinItems = new ArrayList<Item>();
        marwinItems.add(book1);

        stores.add(marwin);
        stores.add(kimex);
        stores.add(steam);
        ourMall.setStores(stores);
        for(Item i:ItemsFromDB){
            marwinItems.add(i);

        }
        marwin.setItems(marwinItems);
        //ourMall.listOfAllStores();
        System.out.println(marwin.listOfItems());
    }
}

