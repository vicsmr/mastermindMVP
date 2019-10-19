package mastermind.models;

import java.util.List;

import mastermind.types.Color;
import mastermind.types.State;

public class Session {
	
	private Game game;
	private State state;
	
	public Session() {
		this.game = new Game();
		this.state = State.values()[0];
	}
	
	public State getState() {
		return this.state;
	}
	
	public void next() {
		this.state = State.values()[state.ordinal() + 1];
	}
	
	public int getGameWidth() {
		return this.game.getCombinationWidth();
	}
	
	public boolean isWinner() {
		return this.game.isWinner();
	}

	public boolean isLooser() {
		return this.game.isLooser();
	}
	
	public int getAttempts() {
		return this.game.getAttempts();
	}

	public List<Color> getColors(int position) {
		return this.game.getColors(position);
	}

	public int getBlacks(int position) {
		return this.game.getBlacks(position);
	}

	public int getWhites(int position) {
		return this.game.getWhites(position);
	}
	
	public void addGameProposedCombination(List<Color> colors) {
		this.game.addProposedCombination(colors);
	}
	
	public void resume() {
		this.game.clear();
		this.state = State.values()[0];
	}

}
