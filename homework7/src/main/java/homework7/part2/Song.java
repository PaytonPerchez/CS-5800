package homework7.part2;

public class Song {

	private String title;
	private String artist;
	private String album;
	private int duration;
	
	public Song(String title, String artist, String album, int duration) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.duration = duration;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public int getId() {
		return this.hashCode();
	}
	
	@Override
	public String toString() {
		return title + " (" + album + ") by " + artist;
	}
}
