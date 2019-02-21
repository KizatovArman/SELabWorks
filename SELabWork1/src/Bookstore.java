import java.util.*;
import java.util.Vector;

public class Bookstore extends Store {
    public Bookstore(){

    }
    public Bookstore(String name, int storeId){
        super(name,storeId);
        this.setItems(new ArrayList<Item>());
    }
    public String listOfItems(){
        if(this.getItems().size()==0){
            return this.getName()+" has not added anything. Comeback later.";
        }
        int cnt=1;
        String just= "Bookstore - "+this.getName()+" has the following items:\n";
        String list= "";
        Iterator it = this.getItems().iterator();
        while(it.hasNext()){
            Item cur = (Item)it.next();
            String output =(cnt+""+". ")+cur+"\n";
            list += output;
            cnt++;
        }
        return just+list;
    }
    public String toString(){
        return "Hello welcome to our "+this.getName() +" Bookstore!" ;
    }
}
