package al.challenge;

import java.util.ArrayList;
import java.util.Scanner;

record Contact(String name, String phoneNumber){
    @Override
    public String toString(){
        return String.format("%s -> %s", name, phoneNumber);
    }
}
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;
    public MobilePhone(String number){
        this.myNumber = number;
        this.contact = new ArrayList<>();
    }

    public static void printActions(){
        String textBlock = """
                0. Exit
                1. Add Contact
                2. Remove Contact
                3. Search Contact""";
        System.out.print(textBlock + " ");
    }
    public static boolean addNumber(ArrayList<Contact> contact){
        if (!findContact()){

        }
    }

    public static boolean findNumber(ArrayList<Contact> contact){
        if (contact.indexOf(myNumber)){

        }
    }

}
