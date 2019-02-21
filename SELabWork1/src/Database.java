import java.io.*;
import java.util.*;

public class Database {
    public Database(){ }

    public ArrayList<Item> getItemsForStore(String path){
        ArrayList<Item> items = new ArrayList<Item>();
        try{
            FileReader fileReader= new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input= bufferedReader.readLine();
            while (input !=null){
                String[] itms = input.split(" ");
                if(itms[2].equals("100")) {
                    Test.marwin.getItems().add(new Item(itms[0], Integer.parseInt(itms[1]),Integer.parseInt(itms[2]),Double.parseDouble(itms[3])));
                    System.out.println(itms[0] + itms[1] +itms[2] + itms[3]);
                }
                if(itms[2].equals("101")) {
                    Test.steam.getItems().add(new Item(itms[0], Integer.parseInt(itms[1]),Integer.parseInt(itms[2]),Double.parseDouble(itms[3])));
                    System.out.println(itms[0] + itms[1] +itms[2] + itms[3]);
                }
                if(itms[2].equals("110")){
                    Test.kimex.getItems().add(new Item(itms[0], Integer.parseInt(itms[1]),Integer.parseInt(itms[2]),Double.parseDouble(itms[3])));
                    System.out.println(itms[0] + itms[1] +itms[2] + itms[3]);
                }

                input=bufferedReader.readLine();
            }
            fileReader.close();
            bufferedReader.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        return items;
    }

}
