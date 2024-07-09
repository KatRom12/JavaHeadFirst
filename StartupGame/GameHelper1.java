import java.util.Scanner;

public class GameHelper1 {
	public int getUserInput(String prompt){
		System.out.print(prompt + ": ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}