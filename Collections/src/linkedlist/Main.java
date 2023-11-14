package linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var list = new LinkedList<String>();
        list.add("canada");
        list.add(0,"America");
        System.out.println(list);

        addElements(list);
        System.out.println(list);
    }

    public static void addElements(LinkedList<String> list){
        list.addFirst("Russia");
        list.addLast("Japan");

//        Queue methods
        list.offer("Europe");
        list.offerFirst("Italy");
        list.offerLast("Australia");

//        Stack methods

    }
}
