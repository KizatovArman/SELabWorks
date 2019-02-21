import java.util.ArrayList;
import java.util.Iterator;

import java.util.Vector;

public class Store {
    private String name;
    private int storeId;
    private ArrayList<Item> items;
    private ArrayList<Customer> customers;
    private ArrayList<Observer> observers;


    public Store(){}

    public Store(String name, int storeId,ArrayList<Item> items, ArrayList<Customer> customers,ArrayList<Observer> observers){
        this.name = name;
        this.storeId = storeId;
        this.items = items;
        this.customers = customers;
        this.observers=observers;
    }
    public Store(String name,int storeId)
    {
        this.name = name;
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
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
        if(cnt == this.customers.size()){
            System.out.println("Client "+ c.getName()+" is not in " + this.name+".");
        }
    }
    public void addObserver(Observer o){
        this.observers.add(o);
    }

    public boolean equals(Object obj){
        if(obj == this)
            return true;
        if(obj == null || obj.getClass() != this.getClass())
            return false;
        Store newStore = (Store) obj;
        return this.name.equals(newStore.getName())&&
                this.storeId==newStore.storeId&&
                this.items.equals(newStore.items)&&
                this.customers.equals(newStore.customers)&&
                this.observers.equals(newStore.observers);
    }


    public String toString(){
        return "Hello welcome to " + this.getName()+"!";
    }

}
