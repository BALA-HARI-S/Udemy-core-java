package al.challenge;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String number){
        this.myNumber = number;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for(int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public boolean updateContact(Contact contact, Contact updatedContact){
        int oldContact = myContacts.indexOf(contact);
        if(oldContact < 0){
            return false;
        }

        myContacts.set(oldContact, updatedContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        int position = myContacts.indexOf(contact);
        if(position < 0){
            return false;
        }
        myContacts.remove(position);
        return true;
    }

    public Contact queryContact(String name){
        int position = myContacts.indexOf(name);
        if(position < 0){
            return null;
        }

        Contact contact = myContacts.get(position);
        return contact;
    }

    public void printContacts(){
        System.out.println("Contact List");
        for(int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            System.out.println((i+1) + "."  + contact.getName() +
                    " -> " + contact.getPhoneNumber());
        }
    }
}
