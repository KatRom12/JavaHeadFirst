import java.util.*;

public class Jukebox11 {
  public static void main(String[] args) {
	new Jukebox11().go();
  }
  public void go() {
	List<Song> songList = Songs().getSongs();
	System.out.println(songList);
  }
}
