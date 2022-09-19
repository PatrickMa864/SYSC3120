import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> Book = new ArrayList<BuddyInfo>();

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

    public void addBuddy(BuddyInfo buddyInfo){
        Book.add(buddyInfo);
    }

    public void removeBuddy(int index){
        Book.remove(index);
    }
}
