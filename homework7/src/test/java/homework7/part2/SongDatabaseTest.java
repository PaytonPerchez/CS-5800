package homework7.part2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongDatabaseTest {

	@Test
	public void testAddSong() {
		Song song = new Song("title", "artist", "album", 20);
		boolean expected = true;
		SongDatabase database = new SongDatabase();
		
		boolean actual = database.addSong(song);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSearchById() {
		Song expected = new Song("title", "artist", "album", 20);
		SongDatabase database = new SongDatabase();
		
		database.addSong(expected);
		Song actual = database.searchById(expected.getId());
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSearchByTitle() {
		Song expected = new Song("title", "artist", "album", 20);
		SongDatabase database = new SongDatabase();
		
		database.addSong(expected);
		Song actual = database.searchByTitle(expected.getTitle()).get(0);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSearchByArtist() {
		Song expected = new Song("title", "artist", "album", 20);
		SongDatabase database = new SongDatabase();
		
		database.addSong(expected);
		Song actual = database.searchByAlbum(expected.getAlbum()).get(0);
		
		assertEquals(expected, actual);
	}
}
