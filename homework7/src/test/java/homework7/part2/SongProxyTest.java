package homework7.part2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongProxyTest {

	@Test
	public void testSearchById() {
		Song expected = new Song("title", "artist", "album", 20);
		SongDatabase database = new SongDatabase();
		SongProxy proxy = new SongProxy(database);
		
		database.addSong(expected);
		Song actual = proxy.searchById(expected.getId());
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSearchByTitle() {
		Song expected = new Song("title", "artist", "album", 20);
		SongDatabase database = new SongDatabase();
		SongProxy proxy = new SongProxy(database);
		
		database.addSong(expected);
		Song actual = proxy.searchByTitle(expected.getTitle()).get(0);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSearchByAlbum() {
		Song expected = new Song("title", "artist", "album", 20);
		SongDatabase database = new SongDatabase();
		SongProxy proxy = new SongProxy(database);
		
		database.addSong(expected);
		Song actual = proxy.searchByAlbum(expected.getAlbum()).get(0);
		
		assertEquals(expected, actual);
	}
}
