package homework6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Iterator;

public class UserTest {

	@Test
	public void testGetUsername() {
		String expected = "Alice";
		User alice = new User(expected);
		
		String actual = alice.getUsername();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetChatHistory() {
		User alice = new User("Alice");
		Message[] expected = new Message[0];
		
		Message[] actual = alice.getChatHistory();
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testGetBlockedUsers() {
		User alice = new User("Alice");
		String[] expected = new String[0];
		
		String[] actual = alice.getBlockedUsers();
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testBlockUser() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		String[] expected = new String[] {bob.getUsername()};
		
		alice.blockUser(bob.getUsername());
		String[] actual = alice.getBlockedUsers();
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testSendMessage() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		ChatServer mediator = ChatServer.getInstance();
		mediator.addUser(alice);
		mediator.addUser(bob);
		
		alice.sendMessage("Hi", bob.getUsername());
		Message[] expected = alice.getChatHistory();
		Message[] actual = bob.getChatHistory();
		
		// reset singelton Object for use in remaining tests
		mediator.removeUser(alice);
		mediator.removeUser(bob);
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testReceiveMessage() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		Message[] expected = new Message[] {message};
		
		bob.receiveMessage(message);
		Message[] actual = bob.getChatHistory();
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testUndoPreviousMessage() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		ChatServer mediator = ChatServer.getInstance();
		mediator.addUser(alice);
		mediator.addUser(bob);
		String expected = "0: Message was deleted";
		
		alice.sendMessage("Hi", bob.getUsername());
		alice.undoPreviousMessage();
		Message removedMessage = bob.getChatHistory()[0];
		String actual = removedMessage.getTimestamp() + ": " + removedMessage.getContent();
		
		// reset singelton Object for use in remaining tests
		mediator.removeUser(alice);
		mediator.removeUser(bob);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIterator() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		ChatServer mediator = ChatServer.getInstance();
		mediator.addUser(alice);
		mediator.addUser(bob);
		
		alice.sendMessage("Hi", bob.getUsername());
		Message expected = alice.getChatHistory()[0];
		Iterator<Message> iterator = bob.iterator(alice);
		Message actual = iterator.next();
		
		// reset singelton Object for use in remaining tests
		mediator.removeUser(alice);
		mediator.removeUser(bob);
		
		assertEquals(expected, actual);
	}
}
