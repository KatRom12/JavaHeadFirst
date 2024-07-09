class SimpleStartup {
	private ArrayList<String> locationCells;
	//private int numOfHits = 0;

	public static void main (String[] args){
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		
		SimpleStartup theStartup = new SimpleStartup();
		
		int randomNum = (int) (Math.random() * 5);
		int[] locations = {randomNum, randomNum + 1, randomNum + 2};
		theStartup.setLocationCells(locations);
		
		boolean isAlive = true;
		
		while(isAlive){
			int guess =  helper.getUserInput("enter a number");
			String result = theStartup.checkYourself(guess);
			numOfGuesses ++;
			
			if(result.equals("kill")){
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}	
		
	public void setLocationCells(ArrayList<String> locs){
		locationCells = locs;
	}	
	
	public String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
	
		if (index >= 0) {
			locationCells.remove(index);
	
			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
		}
		return result;
	}	
}	