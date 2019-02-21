public class Customer {
    private String name;
    private ShoppingCart shoppingCart;
    private Store store;

    public Customer(String name, ShoppingCart shoppingCart, Store store){
        this.name = name;
        this.shoppingCart = shoppingCart;
        this.store = store;
    }
    public Customer(String name,ShoppingCart shoppingCart){
        this.name = name;
        this.shoppingCart = shoppingCart;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(obj == null || obj.getClass() != this.getClass())
            return false;
        Customer gost = (Customer) obj;
        return this.getName().equals(gost.getName()) &&
                this.shoppingCart.equals(gost.getShoppingCart())&&
                this.store.equals(gost.store);
    }

    public String toString(){
        return "Hello my name is "+this.name+".";
    }
}

