import java.util.*;
import java.lang.*;
import java.util.ArrayList;

class NeverHaveIEver{
	final int maxScore;
	Player[] players;
	public static List<String> theNevers;
	boolean isGameOver;
	Player theWinner;

	NeverHaveIEver(){
		maxScore = 5;
		players = new Player[4];
		theNevers = new ArrayList<String>();
	}

	public void initialize(Player[] thePlayers){
		for(int i = 0; i < thePlayers.length; i++){
			players[i] = thePlayers[i];
		}
	}

	public int getMaxScore(){
		return this.maxScore;
	}

	public void askQuestion(String never){
		theNevers.add(never);
		for(int i = 0; i < players.length; i++){
			
		}
	}

	public String getQuestion(int i){
		if(i < theNevers.size()){
			return this.theNevers.get(i);
		}
		else{
			return "";
		}
	}

	public boolean isThereAWinner(){
		int activePlayers = 0;
		Player winner = new Player();
		for(int i = 0; i < players.length; i++){
			if(players[i].getScore() > 0){
				activePlayers ++;
				theWinner = players[i];
			}
		}
		if(activePlayers > 1){
			return false;
		}
		else if(activePlayers == 0){
			gameOver();
			return false;
		}
		else{
			this.theWinner = winner;
			return true;
		}
	}

	public void gameOver(){
		this.isGameOver = true;
	}



}