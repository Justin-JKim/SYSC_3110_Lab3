import java.util.LinkedList;

public class AddressBook {
	
	private LinkedList<BuddyInfo> list;
	
	public AddressBook(){
		this.list = new LinkedList<BuddyInfo>();
	}
	
	void addBuddy(BuddyInfo add) {
		list.add(add);
	}
	
	void removeBuddy(BuddyInfo remove) {
		list.remove(remove);
	}
}
