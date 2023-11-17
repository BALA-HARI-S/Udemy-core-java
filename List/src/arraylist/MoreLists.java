package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};

//        List is immutable
        List<String> list = List.of(items);
        //list.add("carrots"); // throws runtime exception
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add(0,"carrots");
        groceries.set(1, "curd");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles","mustard","cheese")
        );
        System.out.println(nextList);

//        adding next list to groceries
        groceries.addAll(nextList);
        System.out.println(groceries);

//        print third element using get method

        System.out.println("Third element : " + groceries.get(2));

        //       check if  item exists
        if(groceries.contains("curd")){
            System.out.println("Curd exists!");
        } else {
            System.out.println("Curd doesn't exists in the list");
        }

        groceries.add("curd");
        System.out.println(groceries);
//        index of
        System.out.println("Index of curd : " + groceries.indexOf("curd"));
        System.out.println("Last index of curd : " + groceries.lastIndexOf("curd"));

//        remove all
        System.out.println(groceries);
        groceries.removeAll(List.of("pickles","mustard"));
        System.out.println("RemoveAll : \n" + groceries);

//        have only these items in the list and remove others
        groceries.retainAll(List.of("curd","milk","egg"));
        System.out.println("retainAll : \n" + groceries);

//      clear delete everything inside groceries
        System.out.println("Clear : \n" + groceries);
        groceries.clear();
        System.out.println(groceries);
//        is empty?
        System.out.println("isEmpty : " + groceries.isEmpty());

//      adding back some elements
        groceries.addAll(List.of("apple", "orange","lemon"));
        System.out.println("addAll(List.of) : \n" + groceries);

        groceries.addAll(Arrays.asList("tomato","beans","onion"));
        System.out.println("Arrays.asList : \n" + groceries);
//      sort list

        groceries.sort(Comparator.naturalOrder());
        System.out.println(" Sort : \n" + groceries);

    }



}
