package homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ChatServer {

	private ArrayList<User> users;
	private static ChatServer instance;
	
	private ChatServer() {
		users = new ArrayList<User>();
	}
	
	public boolean addUser(User user) {
		if(!exists(user.getUsername())) {
			return users.add(user);
		} else {
			return false;
		}
	}
	
	public boolean removeUser(User user) {
		return users.remove(user);
	}
	
	public boolean exists(String username) {
		for(User user : users) {
			if(user.getUsername().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Sends the given message to its recipients.
	 * @param message The given message.
	 */
	public void routeMessage(Message message) {
		boolean recipientsExist = true;
		String[] recipientNames = message.getRecipients();
		
		// Ensure all listed recipients are registered Users
		for(int i = 0; i < recipientNames.length; i++) {
			if(!exists(recipientNames[i])) {
				recipientsExist = false;
				i = recipientNames.length;
			}
		}
		
		// Verify the sender's identity and relay the message
		if(recipientsExist && verifySender(message)) {
			ArrayList<String> remainingRecipients = new ArrayList<String>(Arrays.asList(message.getRecipients()));
			User[] recipients = new User[remainingRecipients.size()];
			int recipientIndex = 0;
			
			// Get the User Objects associated with the recipient usernames
			for(User user : users) {
				if(remainingRecipients.contains(user.getUsername())) {
					recipients[recipientIndex] = user;
					remainingRecipients.remove(user.getUsername());
					recipientIndex++;
				}
			}
			
			// Relay the message to non-blocking recipients
			for(User recipient : recipients) {
				if(!Arrays.asList(recipient.getBlockedUsers()).contains(message.getSender())) {
					recipient.receiveMessage(message);
				}
			}
		}
	}
	
	/**
	 * Ensures the given message is being/has been sent by the listed sender.
	 * @param message The given message
	 * @return True if the message came from the listed sender, false otherwise.
	 */
	public boolean verifySender(Message message) {
		
		// Ensure the listed sender is a registered User
		if(exists(message.getSender())) {
			
			// Find the User associated with the listed sender's username
			User sender = null;
			for(User user : users) {
				if(user.getUsername().equals(message.getSender())) {
					sender = user;
				}
			}
			
			// Verify the sender's identity by checking if the given message appears in their chat history
			List<Message> senderHistory = Arrays.asList(sender.getChatHistory());
			return senderHistory.contains(message);
			
		} else {
			return false;
		}
	}
	
	public static ChatServer getInstance() {
		if(instance == null) {
			instance = new ChatServer();
		}
		return instance;
	}
}
