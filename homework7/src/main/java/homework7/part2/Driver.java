package homework7.part2;

public class Driver {

	public static void main(String[] args) {
		SongDatabase sourceDatabase = new SongDatabase();
		Song song1 = new Song("Song1", "artist1", "album1", 100);
		Song song2 = new Song("Song2", "artist1", "album1", 100);
		sourceDatabase.addSong(song1);
		sourceDatabase.addSong(song2);
		sourceDatabase.addSong(new Song("Song1", "artist2", "album1", 200));
		sourceDatabase.addSong(new Song("Song2", "artist2", "album1", 150));
		sourceDatabase.addSong(new Song("Song1", "artist3", "album2", 250));
		
		SongProxy proxy = new SongProxy(sourceDatabase);
		
		// Search for song1
		long start = System.currentTimeMillis();
		System.out.println(proxy.searchById(song1.getId()));
		long end = System.currentTimeMillis();
		System.out.println("Request took " + ((end - start) / 1000.0) + " seconds\n");
		
		// Search for Songs with titles "Song2"
		start = System.currentTimeMillis();
		System.out.println(proxy.searchByTitle("Song2"));
		end = System.currentTimeMillis();
		System.out.println("Request took " + ((end - start) / 1000.0) + " seconds\n");
		
		// Search for Songs with album titles "album2"
		start = System.currentTimeMillis();
		System.out.println(proxy.searchByAlbum("album2"));
		end = System.currentTimeMillis();
		System.out.println("Request took " + ((end - start) / 1000.0) + " seconds\n");
		
		// Search for Songs with album titles "album1"
		start = System.currentTimeMillis();
		System.out.println(proxy.searchByAlbum("album1"));
		end = System.currentTimeMillis();
		System.out.println("Request took " + ((end - start) / 1000.0) + " seconds\n");
	}
}
