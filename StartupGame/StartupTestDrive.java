public class StartupTestDrive {
	public static void main (String[] args) {
		StartupBust dot = new StartupBust();
		
		System.out.println(startups.isEmpty());
		
		System.out.println(startups.get(1).isEmpty());
		
		
		
		String userInput = "C2";
		String result = dot.checkUserGuess(userInput);
		
		String testResult = "failed";
		if (result.equals("hit")){
			testResult = "passed";
		}

		System.out.println(testResult);		
	}		
}	