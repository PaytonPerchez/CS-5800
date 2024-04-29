package homework7.part2;

import java.util.ArrayList;
import java.util.List;

public class SongProxy implements SongService {

	private SongDatabase database;
	private ArrayList<Song> cache;
	
	public SongProxy(SongDatabase database) {
		this.database = database;
		this.cache = new ArrayList<Song>();
	}
	
	public Song searchById(Integer songID) {
		
		for(Song song : cache) {
			if(song.getId() == songID) {
				return song;
			}
		}
		Song song = database.searchById(songID);
		
		if(song != null) {
			cache.add(song);
		}
		return song;
	}
	
	public List<Song> searchByTitle(String title) {
		List<Song> songList = new ArrayList<Song>();
		
		for(Song song : cache) {
			if(song.getTitle().equals(title)) {
				songList.add(song);
			}
		}
		
		if(songList.isEmpty()) {
			songList = database.searchByTitle(title);
			
			for(Song song : songList) {
				cache.add(song);
			}
		}
		return songList;
	}
	
	public List<Song> searchByAlbum(String album){
		List<Song> songList = new ArrayList<Song>();
		
		for(Song song : cache) {
			if(song.getAlbum().equals(album)) {
				songList.add(song);
			}
		}
		
		if(songList.isEmpty()) {
			songList = database.searchByAlbum(album);
			
			for(Song song : songList) {
				cache.add(song);
			}
		}
		return songList;
	}
}
