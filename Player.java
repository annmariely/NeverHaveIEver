class Player{
	String name;
	int score;
	Boolean gameOver;

	Player(){
	}

	Player(String enterName, NeverHaveIEver game){
		this.name = enterName;
		this.score = game.getMaxScore();
		gameOver = false;
	}

	public String askPlayer(NeverHaveIEver game){
		if(game.theNevers.size() > 0){
			return game.theNevers.get(game.theNevers.size() - 1);
		}
		else{
			return "";
		}
	}

	public void setPlayerAnswer(boolean answer, NeverHaveIEver game){
		if(!answer){
			this.score--;
		}
	}

	public int getScore(){
		return this.score;
	}
}