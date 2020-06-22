// package Phone;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Cellphone myPhone = new Cellphone(1234567890);

    public static void main(String[] args) {
        boolean active = true;
        Options();
        while (active) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Goodbye");
                    active = false;
                    break;

                case 1:
                    myPhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                // case 5:
                // queryContact();
                // break;

                case 5:
                    Options();
                    break;
            }
        }
    }

    private static void Options() {
        System.out.println("Available actions: ");
        System.out.println("0 - Exit");
        System.out.println("1 - Print Contacts");
        System.out.println("2 - Add New Contact");
        System.out.println("3 - Update Existing Contact");
        System.out.println("4 - Remove Existing Contact");
        // System.out.println("5 - Look for Contact");
        System.out.println("5 - Print Options");
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        int phone = scanner.nextInt();
        Contact newContact = Contact.createContact(name, phone);
        // Contact newContact = new Contact(name, phone);
        if (myPhone.addNewContact(newContact)) {
            System.out.println("New Contact Added");
        } else
            System.out.println("Contact Already Exists");

    }

    private static void updateContact() {
        System.out.println("Select the contact name you wish to modify: ");
        String name = scanner.nextLine();
        System.out.println("Enter their new number: ");
        int phone = scanner.nextInt();
        if (myPhone.updateContact(name, phone)) {
            System.out.println(name + "'s Number Has Been Updated to " + phone);
        } else {
            System.out.println("Contact Not Found");
        }
    }

    private static void removeContact() {
        System.out.println("Select the contact name you wish to remove: ");
        String name = scanner.nextLine();
        myPhone.removeContact(name);
    }
}