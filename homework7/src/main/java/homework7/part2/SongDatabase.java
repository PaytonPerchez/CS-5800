package homework7.part2;

import java.util.ArrayList;
import java.util.List;

public class SongDatabase implements SongService {

	private ArrayList<Song> songs;
	
	public SongDatabase() {
		songs = new ArrayList<Song>();
	}
	
	public boolean addSong(Song song) {
		return songs.add(song);
	}
	
	public Song searchById(Integer songID) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {}
		
		for(Song song : songs) {
			if(song.getId() == songID) {
				return song;
			}
		}
		return null;
	}

	public List<Song> searchByTitle(String title) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {}
		
		ArrayList<Song> songList = new ArrayList<Song>();
		
		for(Song song : songs) {
			if(song.getTitle().equals(title)) {
				songList.add(song);
			}
		}
		return songList;
	}

	public List<Song> searchByAlbum(String album) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {}
		
		ArrayList<Song> songList = new ArrayList<Song>();
		
		for(Song song : songs) {
			if(song.getAlbum().equals(album)) {
				songList.add(song);
			}
		}
		return songList;
	}
}
