// package Phone;

public class Contact {
    private String name;
    private int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    // saveContact(){
    // }
    public void setContact(int newNumber) {
        this.number = newNumber;
    }

    // searchContact(){
    // }
    // removeContact(number){
    // }
    public String getName() {
        return this.name;
    }

    public int getPhoneNumber() {
        return this.number;
    }

    // public static Contact createContcat()
    public static Contact createContact(String name, int number) {
        return new Contact(name, number);
    }
}