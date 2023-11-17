package al.challenge;

public class nextMain {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("3456");

        Contact contact1 = Contact.createContact("hari", "1234");
        Contact contact2 = Contact.createContact("bala", "5678");
        Contact contact3 = Contact.createContact("dinesh", "9876");

        // Add contacts
        myPhone.addNewContact(contact1);
        myPhone.addNewContact(contact2);
        myPhone.addNewContact(contact3);

        // Print initial contacts
        myPhone.printContacts();

        // Update a contact
        Contact updatedContact = Contact.createContact("hari Updated", "4321");
        myPhone.updateContact(contact1, updatedContact);

        // Print updated contacts
        myPhone.printContacts();

        // Remove a contact
        myPhone.removeContact(contact2);

        // Print final contacts
        myPhone.printContacts();

        // Query a contact
        Contact queriedContact = myPhone.queryContact("dinesh");
        if (queriedContact != null) {
            System.out.println("Queried Contact: " + queriedContact.getName() + " -> " +
                    queriedContact.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }
    }
}
