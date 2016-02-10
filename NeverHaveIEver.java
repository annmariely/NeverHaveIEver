import java.util.*;
import java.lang.*;

class NeverHaveIEver{
	final int maxScore;
	Player[] players;
	ArrayList<String> theNevers;

	NeverHaveIEver(){
		maxScore = 5;
		players = new Player[4];
		theNevers = new ArrayList<String>();
	}

	public void initialize(Player[] thePlayers){
		for(int i = 0; i < thePlayers.length; i++){
			players[i] = thePlayers[i]
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
		if(i < theNevers.length()){
			return theNevers[i];
		}
		else{
			return "Not a valid question..."
		}
	}




}