import java.util.ArrayList;

public class AddressBook{
    private ArrayList<BuddyInfo> Book;

    public AddressBook(){
        Book = new ArrayList<>();
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

    public void addBuddy(BuddyInfo buddyInfo){
        if(buddyInfo != null) {
            Book.add(buddyInfo);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < Book.size()){
            return Book.remove(index);
        }
        return null;
    }

    public void method(){
        System.out.println("test");
    }
}
