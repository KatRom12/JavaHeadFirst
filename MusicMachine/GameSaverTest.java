import java.io.*;

public class GameSaverTest {
  public static void main(String[] args) {
    GameCharacter one = new GameCharacter(50, "Elf", 
										new String[]{"bow", "sword", "dust"});
	GameCharacter two = new GameCharacter(200, "Troll", 
										new String[]{"bare hands", "big ax"});
	GameCharacter three = new GameCharacter(120, "Magician", 
										new String[]{"spells", "invisibility"});
	

	try {
	  ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
	  os.writeObject(one);
	  os.writeObject(two);
	  os.writeObject(three);
	  os.close();
	} catch (IOException e) {
      e.printStackTrace();
	}

	try {
	  ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
	  GameCharacter oneRestore = (GameCharacter) is.readObject();
	  GameCharacter twoRestore = (GameCharacter) is.readObject();
	  GameCharacter threeRestore = (GameCharacter) is.readObject();
	  
	  System.out.println("One's type is " + oneRestore.getType());
	  System.out.println("Two's type is " + twoRestore.getType());	
	  System.out.println("Three's type is " + threeRestore.getType());
	} catch (Exception e) {
      e.printStackTrace();
    }
  }
}  