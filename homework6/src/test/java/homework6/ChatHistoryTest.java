package homework6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Iterator;

public class ChatHistoryTest {

	@Test
	public void testGetHistory() {
		ChatHistory history = new ChatHistory(new User("user"));
		Message[] expected = new Message[0];
		
		Message[] actual = history.getHistory();
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testAddMessage() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		Message[] expected = new Message[] {message};
		
		ChatHistory history = new ChatHistory(alice);
		history.addMessage(message);
		Message[] actual = history.getHistory();
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testGetLastSentMessage() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		Message expected = new Message("Hi", alice.getUsername(), bob.getUsername());
		
		ChatHistory history = new ChatHistory(alice);
		history.addMessage(expected);
		Message actual = history.getLastSentMessage();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIterator() {
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
