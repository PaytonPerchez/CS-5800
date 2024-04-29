package homework7.part2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {

	@Test
	public void testGetTitle() {
		String expected = "title";
		Song song = new Song(expected, "artist", "album", 20);
		
		String actual = song.getTitle();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetArtist() {
		String expected = "artist";
		Song song = new Song("title", expected, "album", 20);
		
		String actual = song.getArtist();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetAlbum() {
		String expected = "album";
		Song song = new Song("title", "artist", expected, 20);
		
		String actual = song.getAlbum();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetDuration() {
		int expected = 20;
		Song song = new Song("title", "artist", "album", expected);
		
		int actual = song.getDuration();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetId() {
		Song song = new Song("title", "artist", "album", 20);
		int expected = song.hashCode();
		
		int actual = song.getId();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testToString() {
		Song song = new Song("title", "artist", "album", 20);
		String expected = "title (album) by artist";
		
		String actual = song.toString();
		
		assertEquals(expected, actual);
	}
}
