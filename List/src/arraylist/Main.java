package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}
public class Main {
    public static void main(String[] args) {

        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk", "DAIRY", 1);

        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("apple", "PRODUCE", 2));
        groceryList.add(0,new GroceryItem("strawberry", "PRODUCE", 5));
        System.out.println(groceryList);
        groceryList.set(1,new GroceryItem("orange", "PRODUCE", 3));
        System.out.println("Set : \n" + groceryList);
        groceryList.remove(1);
        System.out.println("After Removed : \n" + groceryList);
    }
}
