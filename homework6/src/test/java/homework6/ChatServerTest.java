package homework6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ChatServerTest {

	@Test
	public void testAddUser() {
		User alice = new User("Alice");
		ChatServer mediator = ChatServer.getInstance();
		
		boolean expected = !mediator.addUser(alice);
		boolean actual = mediator.addUser(alice);
		
		// reset singelton Object for use in remaining tests
		mediator.removeUser(alice);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemoveUser() {
		User alice = new User("Alice");
		ChatServer mediator = ChatServer.getInstance();
		
		boolean expected = mediator.addUser(alice);
		boolean actual = mediator.removeUser(alice);
		
		// reset singelton Object for use in remaining tests
		mediator.removeUser(alice);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testExists() {
		User alice = new User("Alice");
		ChatServer mediator = ChatServer.getInstance();
		boolean expected = true;
		
		mediator.addUser(alice);
		boolean actual = mediator.exists(alice.getUsername());
		
		// reset singelton Object for use in remaining tests
		mediator.removeUser(alice);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRouteMessage() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		ChatServer mediator = ChatServer.getInstance();
		mediator.addUser(alice);
		mediator.addUser(bob);
		Message[] expected = new Message[0];
		
		mediator.routeMessage(message);
		Message[] actual = bob.getChatHistory();
		
		// reset singelton Object for use in remaining tests
		mediator.removeUser(alice);
		mediator.removeUser(bob);
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testVerifySender() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		ChatServer mediator = ChatServer.getInstance();
		mediator.addUser(alice);
		mediator.addUser(bob);
		boolean expected = false;
		
		boolean actual = mediator.verifySender(message);
		
		// reset singelton Object for use in remaining tests
		mediator.removeUser(alice);
		mediator.removeUser(bob);
		
		assertEquals(expected, actual);
	}
}
