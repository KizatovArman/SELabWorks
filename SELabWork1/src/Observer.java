public class Observer {
    public Observer(){
    }
    public void updateAdd(Store store,Item item){
        System.out.println("Attention to all customers! A store - " + store.getName()+" added a new item to sell. It is "+
                item.getName()+ " just for "+item.getPrice()+"$. Don't miss!");
    }
    public void updateDelete(Store store,Item item){
        System.out.println("Attention to all customers! A store - " + store.getName()+" doesn't sell "+
                item.getName()+ " anymore!");
    }
}
