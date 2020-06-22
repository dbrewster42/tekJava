// package Phone;

import java.util.ArrayList;

public class Cellphone {
    private int myNumber;
    private ArrayList<Contact> myContacts;

    public Cellphone(int number) {
        myNumber = number;
        myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            // System.out.println("Contact already exists");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(
                    (i + 1) + ": " + myContacts.get(i).getName() + " -- " + myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean updateContact(String contactName, int newNumber) {
        int position = findContact(contactName);
        if (position < 0) {
            // System.out.println("Contact Not Found");
            return false;
        } else {
            myContacts.get(position).setContact(newNumber);
            // myContacts.set(position.number = newNumber);
            // System.out.println(
            // contactName + "'s Number Has Been Updated to " +
            // myContacts.get(position).getPhoneNumber());
            return true;

        }
    }

    public void removeContact(String name) {
        int position = findContact(name);
        if (position < 0) {
            System.out.println(name + " was not found.");
        }
        myContacts.remove(position);
        System.out.println(name + " was removed.");
    }
}