import java.util.LinkedList;

public class AddressBook {
	
	private LinkedList<BuddyInfo> list;
	
	public AddressBook(){
		this.list = new LinkedList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo add) {
		if(add != null){
			list.add(add);
		}
	}
	
	public void removeBuddy(int index) {
		if(index >= 0 && index < list.size()) {
			list.remove(index);
		}
	}
	
	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
	}
}
