package homework6;

import java.util.ArrayList;
import java.util.Arrays;

public class Message {

	private String content = "Message was deleted";
	private String sender;
	private ArrayList<String> recipients;
	private long timestamp = 0;
	private MessageMemento saveState;
	
	public Message(String content, String sender, String... recipients) {
		this.saveState = new MessageMemento(this);
		this.content = content;
		this.sender = sender;
		this.recipients = new ArrayList<String>(Arrays.asList(recipients));
		this.timestamp = System.currentTimeMillis();
	}
	
	public String getContent() {
		return content;
	}
	
	public String getSender() {
		return sender;
	}
	
	public String[] getRecipients() {
		return recipients.toArray(new String[recipients.size()]);
	}
	
	public long getTimestamp() {
		return timestamp;
	}
	
	public String getSaveState() {
		return saveState.toString();
	}
	
	public void save() {
		saveState.setContent(content);
		saveState.setTimestamp(timestamp);
	}
	
	public void undo() {
		content = saveState.getContent();
		timestamp = saveState.getTimestamp();
	}
	
	@Override
	public String toString() {
		String result = "Timestamp: " + timestamp + "; Sender: " + sender + "; Recipients: ";
		
		// Add recipients to expected
		for(int i = 0; i < recipients.size(); i++) {
			result += recipients.get(i);
			
			if(i < recipients.size() - 1) {
				result += ", ";
			}
		}
		result += "; Content: " + content;
		
		return result;
	}
}
