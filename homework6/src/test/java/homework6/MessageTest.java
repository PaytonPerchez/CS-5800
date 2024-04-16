package homework6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MessageTest {

	@Test
	public void testGetContent() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		String expected = "Hi";
		
		Message message = new Message(expected, alice.getUsername(), bob.getUsername());
		String actual = message.getContent();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetSender() {
		String expected = "Alice";
		User alice = new User(expected);
		User bob = new User("Bob");
		
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		String actual = message.getSender();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetRecipients() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		String[] expected = new String[] {bob.getUsername()};
		String[] actual = message.getRecipients();
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testGetTimestamp() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		/*
		 *  expected is recorded immediately after Message initialization to keep
		 *  the two values as close as possible since the last operation performed
		 *  during initialization is to set the actual timestamp
		 */
		long expected = System.currentTimeMillis();
		long actual = message.getTimestamp();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetSaveState() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		String expected = "0: Message was deleted";
		
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		String actual = message.getSaveState();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSave() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		/*
		 *  expectedTimestamp is recorded immediately after Message initialization
		 *  to keep the two values as close as possible since the last operation
		 *  performed during initialization is to set the actual timestamp
		 */
		String expectedTimestamp = Long.toString(System.currentTimeMillis());
		String expectedMessage = message.getContent();
		String expected = expectedTimestamp + ": " + expectedMessage;
		message.save();
		String actual = message.getSaveState();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testUndo() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		String expected = "0: Message was deleted";
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		
		message.undo();
		String actualContent = message.getContent();
		long actualTimestamp = message.getTimestamp();
		String actual = Long.toString(actualTimestamp) + ": " + actualContent;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testToString() {
		User alice = new User("Alice");
		User bob = new User("Bob");
		Message message = new Message("Hi", alice.getUsername(), bob.getUsername());
		String expected = "Timestamp: " + message.getTimestamp() + "; Sender: " + message.getSender() + "; Recipients: ";
		
		// Add recipients to expected
		for(int i = 0; i < message.getRecipients().length; i++) {
			expected += message.getRecipients()[i];
			
			if(i < message.getRecipients().length - 1) {
				expected += ", ";
			}
		}
		expected += "; Content: " + message.getContent();
		
		String actual = message.toString();
		
		assertEquals(expected, actual);
	}
}
