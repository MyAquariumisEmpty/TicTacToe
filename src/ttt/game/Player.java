package ttt.game;

import ttt.strategy.IGameStrategy;

public class Player implements IPlayer{
	
	private IGameStrategy gameStrategy;
	protected char symbol = ' ';
	
	public Player(char symbol) {
		this.symbol = symbol;
	}
	
	@Override
	public void setStrategy(IGameStrategy s) {
		this.gameStrategy = s;
	}

	@Override
	public IMove nextMove(IGame g) {
		return gameStrategy.nextMove(g);
	}

	@Override
	public char getSymbol() {
		return symbol;
	}
	

}
