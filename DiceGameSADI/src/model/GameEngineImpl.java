package model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import model.interfaces.GameEngine;
import model.interfaces.GameEngineCallback;
import model.interfaces.Player;

public class GameEngineImpl implements GameEngine {

	
	
	
	@Override
	public void addPlayer(Player player) {
		
	//	Player.add(player.getPlayerId(), player);
	}

	
	@Override
	public boolean placeBet(Player player, int bet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void rollPlayer(Player player, int initialDelay, int finalDelay, int delayIncrement) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rollHouse(int initialDelay, int finalDelay, int delayIncrement) {
		// TODO Auto-generated method stub
Math.random();
	}


	@Override
	public Player getPlayer(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removePlayer(Player player) {
	//	Player.remove(player);
		return false;
	}

	@Override
	public void addGameEngineCallback(GameEngineCallback gameEngineCallback) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean removeGameEngineCallback(GameEngineCallback gameEngineCallback) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

}
