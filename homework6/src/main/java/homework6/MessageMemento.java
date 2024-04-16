package homework6;

public class MessageMemento {

	private String content;
	private long timestamp;
	
	public MessageMemento(Message message) {
		this.content = message.getContent();
		this.timestamp = message.getTimestamp();
	}
	
	public String getContent() {
		return content;
	}
	
	public long getTimestamp() {
		return timestamp;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	@Override
	public String toString() {
		return timestamp + ": " + content;
	}
}
