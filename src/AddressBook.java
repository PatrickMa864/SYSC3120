import java.util.ArrayList;

public class AddressBook{
    ArrayList<BuddyInfo> Book = new ArrayList<>();

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    public void addBuddy(BuddyInfo buddyInfo){
        Book.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo){
        Book.remove(buddyInfo);
    }
}
