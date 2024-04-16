package homework6;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;

public class SearchMessagesByUser implements Iterator<Message> {

	private int indexInChatHistory;
	private int numOfMessagesInHistory;
	private ArrayList<Message> history;
	private String target;
	
	public SearchMessagesByUser(ChatHistory history, String target) {
		this.indexInChatHistory = 0;
		this.numOfMessagesInHistory = history.getHistory().length;
		this.history = new ArrayList<Message>(Arrays.asList(history.getHistory()));
		this.target = target;
	}
	
	public boolean hasNext() {
		Message message;
		
		while(indexInChatHistory < numOfMessagesInHistory) {
			message = history.get(indexInChatHistory);
			
			// Check recipients for target user
			for(String recipient : message.getRecipients()) {
				if(recipient.equals(target)) {
					return true;
				}
			}
			
			// Check sender for target user
			if(message.getSender().equals(target)) {
				return true;
			} else {
				indexInChatHistory++;
			}
		}
		return false;
	}
	
	public Message next() {
		if(hasNext()) {
			Message result = history.get(indexInChatHistory);
			indexInChatHistory++;
			return result;
		} else {
			return null;
		}
	}
}
