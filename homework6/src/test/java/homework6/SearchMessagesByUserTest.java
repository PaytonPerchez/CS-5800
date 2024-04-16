package homework6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

public class SearchMessagesByUserTest {

	@Test
	public void testHasNext() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		ChatHistory history = new ChatHistory(bob);
		boolean expected = true;
		
		history.addMessage(message);
		Iterator<Message> iterator = history.iterator(alice);
		boolean actual = iterator.hasNext();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNext() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		Message expected = new Message("Hi", alice.getUsername(), bob.getUsername());
		ChatHistory history = new ChatHistory(bob);
		
		history.addMessage(expected);
		Iterator<Message> iterator = history.iterator(alice);
		Message actual = iterator.next();
		
		assertEquals(expected, actual);
	}
}
