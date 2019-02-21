public class Item {
    private String name;
    private int id;
    private int storeId;
    private double price;
    public Item(){

    }
    public Item(String name, int id, int storeId, double price){
        this.name= name;
        this.id = id;
        this.storeId = storeId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public boolean equals(Object obj){
        if(obj == this)
            return true;
        if(obj == null || obj.getClass() != this.getClass())
            return false;
        Item newItem = (Item)obj;
        return this.price == newItem.price&&
                this.id ==newItem.id&&
                this.name.equals(newItem.name);
    }

    public String toString(){
        return "Name of good: " + this.name + ". Id: "+this.id+". Price: "+this.price+".";
    }

}
