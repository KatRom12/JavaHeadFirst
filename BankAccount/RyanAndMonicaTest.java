import java.util.concurrent.*;

public class RyanAndMonicaTest {
	public static void main (String[] args) {
		BankAccount account = new BankAccount();
		RyanAndMonicaJob ryan = new RyanAndMonicaJob("Ryan", account, 50);
		RyanAndMonicaJob monica = new RyanAndMonicaJob("Monica", account, 100);
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(ryan);
		executor.execute(monica);
		executor.shutdown();
	}	
}

class RyanAndMonicaJob implements Runnable {
	private final String name;
	private final BankAccount account;
	private int amountToSpend;
	
	public RyanAndMonicaJob (String name, BankAccount account, int amountToSpend) {
		this.name = name;
		this.account = account;
		this.amountToSpend = amountToSpend;
	}
	
	public void run() {
		goShopping(amountToSpend);
	}

	private void goShopping(int amount) {
		System.out.println(name + " is about to spend");
		account.spend(name, amount);
		System.out.println(name + " finishes spending");
		
	}
}	

class BankAccount {
	private int balance = 100;
	
	public int getBalance() {
		return balance;
	}

	public synchronized void spend(String name, int amount) {
		if (balance >= amount) {
			balance -= amount;
			if (balance < 0) {
				System.out.println("Overdrawn!");
			}
		} else {
			System.out.println("Sorry, not enough for " + name);
		}	
	}
}	