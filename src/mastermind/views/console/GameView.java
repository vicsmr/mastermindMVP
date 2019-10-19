package mastermind.views.console;

import mastermind.models.Session;
import mastermind.types.TypeView;
import mastermind.views.View;
import mastermind.views.ViewPrototype;

public class GameView extends View {
	
	public GameView() {
	}
	
	public void writeln(Session session, ViewPrototype viewPrototype) throws CloneNotSupportedException {
		((AttemptsView) viewPrototype.creater(TypeView.ATTEMPTS)).writeln(session.getAttempts());
		((SecretCombinationView) viewPrototype.creater(TypeView.SECRETCOMBINATION))
			.writeln(session.getGameWidth());
		
		for (int i = 0; i < session.getAttempts(); i++) {
			((ProposedCombinationView) viewPrototype.creater(TypeView.PROPOSEDCOMBINATION))
				.write(session.getColors(i));
			((ResultView) viewPrototype.creater(TypeView.RESULT))
				.writeln(session.getBlacks(i), session.getWhites(i));
		}
	}

}
