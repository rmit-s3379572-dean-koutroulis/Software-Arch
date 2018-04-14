package model;

import model.interfaces.DicePair;
import model.interfaces.Player;

public class SimplePlayer implements Player {
	
	private static int maxPlayerID = 0;

	private String playerId;
	private String playerName;
	private int points;
	private int bet;
	private int rollResult;
	
	public SimplePlayer(String playerId, String playerName, int initialPoints) {
		// TODO Auto-generated constructor stub
		this.playerId = Integer.toString(maxPlayerID++);
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
		return playerId;
	}

	@Override
	public boolean placeBet(int bet) {
		// TODO Auto-generated method stub
		if 
		(bet > getPoints())
			
			return false;
		
		
			return true;
		
	}

	@Override
	public int getBet() {
		// TODO Auto-generated method stub
		return bet;
	}

	@Override
	public DicePair getRollResult() {
		return null;
		// TODO Auto-generated method stub
	}

	@Override
	public void setRollResult(DicePair rollResult) {
		// TODO Auto-generated method stub

	}

}
