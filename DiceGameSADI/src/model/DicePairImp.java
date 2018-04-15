package model;

import model.interfaces.DicePair;

public abstract class DicePairImp implements DicePair {
	private int dice1;
	private int dice2;
	private int numFaces;
	/**
	 * @return value of dice 1 (1 .. numFaces i.e. 1 .. 6 for standard casino dice/die)
	 */
	public int getDice1() {
	this.dice1=numFaces;
		return dice1;
	}
	

	/**
	 * @return value of dice 2 (1 .. numFaces i.e. 1 .. 6 for standard casino die)
	 */
	public int getDice2() {
		dice2=getNumFaces();
		return dice2;
	}
	/**
	 * @return return number of faces (standard casino dice have 6) Dungeons and
	 *         Dragons dice have more!
	 */
	public int getNumFaces() {
		Math.floor((Math.random() * 6) + 1);
		return numFaces;
	}

	/**
	 * 
	 * @return a human readable String that lists the values of this DicePair
	 *         instance (see OutputTrace.txt)
	 */
	@Override
	public String toString()
	{
		return String.format("Dice 1: , Dice 2:," + dice1, dice2);
	}
}
