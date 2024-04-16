package homework6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageMementoTest {

	@Test
	public void testGetContent() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		String expected = message.getContent();
		
		MessageMemento memento = new MessageMemento(message);
		String actual = memento.getContent();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetTimestamp() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		/*
		 *  expected is recorded immediately after Message initialization
		 *  to keep the two values as close as possible since the last operation
		 *  performed during initialization is to set the actual timestamp
		 */
		long expected = message.getTimestamp();
		
		MessageMemento memento = new MessageMemento(message);
		long actual = memento.getTimestamp();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetContent() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		String expected = "Hello";
		
		MessageMemento memento = new MessageMemento(message);
		memento.setContent(expected);
		String actual = memento.getContent();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetTimestamp() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		/*
		 *  expected is recorded immediately after Message initialization
		 *  to keep the two values as close as possible since the last operation
		 *  performed during initialization is to set the actual timestamp
		 */
		long expected = 100;
		
		MessageMemento memento = new MessageMemento(message);
		memento.setTimestamp(expected);
		long actual = memento.getTimestamp();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testToString() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		/*
		 *  expectedTimestamp is recorded immediately after Message initialization
		 *  to keep the two values as close as possible since the last operation
		 *  performed during initialization is to set the actual timestamp
		 */
		long expectedTimestamp = message.getTimestamp();
		String expectedContent = message.getContent();
		String expected = Long.toString(expectedTimestamp) + ": " + expectedContent;
		
		MessageMemento memento = new MessageMemento(message);
		long actualTimestamp = memento.getTimestamp();
		String actualContent = memento.getContent();
		String actual = Long.toString(actualTimestamp) + ": " + actualContent;
		
		assertEquals(expected, actual);
	}
}
