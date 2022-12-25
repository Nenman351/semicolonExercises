package phone;

import java.util.ArrayList;
import java.util.List;

public class Phone {

    private final List<Contact> contacts = new ArrayList<>();

    public Phone(String firstName, String lastName, String phoneNumber, String emailAddress){
    }

    public void add(String firstName, String phoneNumber, String lastName, String emailAddress ) {
        int id = numberOfContacts() +1;
        Contact newContact = new Contact("firstname", "lastname", "phonenumber",1, "emailaddress");
        contacts.add(newContact);

    }
    public int numberOfContacts() {
        return contacts.size();
    }

    public Contact findContactWithId(int id) {
        for (Contact contact: contacts){
            if (contact.getId() == id)return contact;
        }
        return null;
    }

    public void delete(String firstName, String phoneNumber) {
        int id = numberOfContacts()-1;
        Contact contact = new Contact("firstname", "lastname", "phonenumber",1, "emailaddress");
        contacts.remove(contact);
    }
}
