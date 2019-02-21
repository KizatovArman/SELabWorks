import java.util.*;

public class Shoestore extends Store {
    public Shoestore(){

    }
    public Shoestore(String name, int storeid){
        super(name,storeid);
        this.setItems(new ArrayList<Item>());
    }
    public String listOfItems(){
        if(this.getItems().size()==0){
            return this.getName()+" has not added anything. Comeback later.";
        }
        int cnt=1;
        String just= "Shoestore - "+this.getName()+" has the following items:\n";
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
    public String toString() {
        return "Hello welcome to our "+this.getName() +" Shoestore!" ;
    }
}
