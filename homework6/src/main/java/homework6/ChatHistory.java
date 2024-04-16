package homework6;

import java.util.ArrayList;
import java.util.Iterator;

public class ChatHistory implements IterableByUser {

	private User owner;
	private ArrayList<Message> history;
	
	public ChatHistory(User owner) {
		this.owner = owner;
		history = new ArrayList<Message>();
	}
	
	public Message[] getHistory() {
		return history.toArray(new Message[history.size()]);
	}
	
	public Message getLastSentMessage() {
		if(history.size() > 0) {
			int messageIndex = history.size() - 1;
			
			// Filter out received messages
			while(messageIndex >= 0) {
				if(history.get(messageIndex).getSender().equals(owner.getUsername())) {
					return history.get(messageIndex);
				}
				messageIndex--;
			}
		}
		return null;
	}
	
	public void addMessage(Message message) {
		history.add(message);
	}
	
	public Iterator<Message> iterator(User userToSearchWith) {
		return new SearchMessagesByUser(this, userToSearchWith.getUsername());
	}
}
