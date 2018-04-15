package model;

import model.interfaces.DicePair;
import model.interfaces.Player;

public class SimplePlayer implements Player {
	
	private static int maxid = 0;

	private String id;
	private String playerName;
	private int points;
	private int bet;
	private int rollResult;
	
	public SimplePlayer(String playerId, String playerName, int initialPoints) {
		// TODO Auto-generated constructor stub
		this.id = Integer.toString(maxid++);
	}

	@Override
	public String getPlayerName() {
		// TODO Auto-generated method stub
		return playerName;
	}

	@Override
	public void setPlayerName(String playerName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPoints() {
		// TODO Auto-generated method stub
		return points;
	}

	@Override
	public void setPoints(int points) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getPlayerId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public boolean placeBet(int bet) {
		if 
		(bet > getPoints())
			
			return false;
	
		
			return true;
		
	}

	@Override
	public int getBet() {
		
		return bet;
	}

	@Override
	public DicePair getRollResult() {
	//	rollResult = dice1 + dice2;
		return null;
	}

	@Override
	public void setRollResult(DicePair rollResult) {
		

	}	
	public String toString()
	{
		return String.format("INFO: Player: id= s, name= s,"
				+ " points= s", id, playerName, points);
	}

}
