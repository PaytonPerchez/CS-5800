package homework6;

import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		ChatServer mediator = ChatServer.getInstance();
		
		User alice = new User("Alice");
		User bob = new User("Bob");
		User charlie = new User("Charlie");
		
		mediator.addUser(alice);
		mediator.addUser(bob);
		mediator.addUser(charlie);
		
		alice.sendMessage("Hi", bob.getUsername());
		bob.sendMessage("HELLO", alice.getUsername(), charlie.getUsername());
		charlie.blockUser(bob.getUsername());
		alice.sendMessage("Why does Bob shout?", charlie.getUsername());
		charlie.sendMessage("I don't know", alice.getUsername());
		bob.sendMessage("IS ANYONE THERE!", alice.getUsername(), charlie.getUsername());
		
		Iterator<Message> aliceIterator = alice.iterator(charlie);
		Iterator<Message> bobIterator = bob.iterator(alice);
		Iterator<Message> charlieIterator = charlie.iterator(bob);
		
		System.out.println("Alice's Messages With Charlie");
		System.out.println("-------------------------");
		printMessages(aliceIterator);
		System.out.println();
		
		System.out.println("Bob's Messages With Alice");
		System.out.println("-------------------------");
		printMessages(bobIterator);
		System.out.println();
		
		System.out.println("Charlie's Messages With Bob");
		System.out.println("-------------------------");
		printMessages(charlieIterator);
	}
	
	private static void printMessages(Iterator<Message> iterator) {
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
