import java.util.*;

public class Jukebox8 {
  public static void main(String[] args) {
	new Jukebox8().go();
  }
  public void go() {
	List<SongV4> songList = MockSongs.getSongsV4();
	System.out.println(songList);
	
	songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
	System.out.println(songList);
	
	Set<SongV4> songSet = new HashSet<>(songList);
	System.out.println(songSet);
	
	//songList.sort((one, two) -> two.getTitle().compareTo(one.getTitle()));
	//System.out.println(songList);

	//songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
	//System.out.println(songList);
	
	//songList.sort((one, two) -> one.getBpm() - two.getBpm());
	//System.out.println(songList);
  } 
}
  