package homework6;

import java.util.ArrayList;
import java.util.Iterator;

public class User implements IterableByUser {

	private String username;
	private ChatServer mediator;
	private ChatHistory chatHistory;
	private ArrayList<String> blockedUsers;
	
	public User(String username) {
		this.username = username;
		this.mediator = ChatServer.getInstance();
		chatHistory = new ChatHistory(this);
		blockedUsers = new ArrayList<String>();
	}
	
	public String getUsername() {
		return username;
	}
	
	public Message[] getChatHistory() {
		return chatHistory.getHistory();
	}
	
	public String[] getBlockedUsers() {
		return blockedUsers.toArray(new String[blockedUsers.size()]);
	}
	
	public void blockUser(String username) {
		blockedUsers.add(username);
	}
	
	public void sendMessage(String content, String... recipients) {
		boolean recipientsAreValid = true;
		
		// Check recipient list for blocked users
		for(int i = 0; i < recipients.length; i++) {
			if(blockedUsers.contains(recipients[i])) {
				recipientsAreValid = false;
				i = recipients.length;
			}
		}
		
		if(recipientsAreValid) {
			Message message = new Message(content, username, recipients);
			chatHistory.addMessage(message);
			mediator.routeMessage(message);
		}
	}
	
	public void receiveMessage(Message message) {
		chatHistory.addMessage(message);
	}
	
	public void undoPreviousMessage() {
		if(chatHistory.getLastSentMessage() != null) {
			chatHistory.getLastSentMessage().undo();
		}
	}
	
	public Iterator<Message> iterator(User userToSearchWith) {
		return chatHistory.iterator(userToSearchWith);
	}
}
