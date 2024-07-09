
import java.util.*;

public class Jukebox1 {

  public static void main(String[] args) {
    new Jukebox1().go();
  }

  public void go() {
	List<String> songs = MockSongs.getSongStrings();
	/*new ArrayList<>();
	songs.add("somersault");
	songs.add("cassidy");
	songs.add("$10");
	songs.add("havana");
	songs.add("Cassidy");
	songs.add("50 Ways");*/
	System.out.println(songs);
	Collections.sort(songs);
	System.out.println(songs);
  }
}  