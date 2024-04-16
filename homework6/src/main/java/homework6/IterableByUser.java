package homework6;

import java.util.Iterator;

public interface IterableByUser {

	public Iterator<Message> iterator(User userToSearchWith);
}
