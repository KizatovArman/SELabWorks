import java.util.*;

public class Mall {
    private String name;
    private ArrayList<Store> stores;
    private ArrayList<Customer> customers;

    public Mall(){}

    public Mall(String name){
        this.name = name;
    }
    public Mall(String name, ArrayList<Store> stores){
        this.name = name;
        this.stores = stores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Store> getStores() {
        return stores;
    }

    public void setStores(ArrayList<Store> stores) {
        this.stores = stores;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }



    public void enter(Customer c){
        this.customers.add(c);
    }
    public void exit(Customer c){
        int cnt =0;
        for (Customer customer : customers) {
            if (customer.equals(c)) {
                System.out.println(c.getName() + " was successfully removed from " + this.name+".");
                customers.remove(customer);
            }
            else{
                cnt++;
            }
        }
        if(cnt == customers.size()){
            System.out.println("Client "+ c.getName()+" is not in " + this.name+".");
        }
    }

    public static ShoppingCart getShoppingCart(){
        return new ShoppingCart();
    }

    public void addNewStore(Store store){
        int cnt=0;
        for(Store s:stores){
            if(s.equals(store)){
                System.out.println("Unfortunately you can't add this store, because we already have in our "+this.name+" Mall.");
            }
            else{
                cnt++;
            }
        }
        if(cnt==this.stores.size()){
            this.stores.add(store);
        }
    }

    public void listOfAllStores(){
        System.out.println("In our mall - "+this.name+" we have these stores:");
        for(Store store:stores){
            System.out.println(store.toString());
        }
    }
    public void listOfAllItems(){
        System.out.println("In our mall - "+this.name+" we sell:");
                for(Store store:stores){
                    store.listOfItems();
                }
    }
    public void listOfAllCustomers(){
        System.out.println("Today we have such customers:");
        for(Customer c: customers){
            System.out.println(c.toString());
        }
    }
}
