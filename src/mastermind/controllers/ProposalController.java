package mastermind.controllers;

import java.util.List;

import mastermind.models.Combination;
import mastermind.models.Session;
import mastermind.types.Color;
import mastermind.types.Error;
import mastermind.types.TypeView;
import mastermind.views.MessageView;
import mastermind.views.console.ErrorView;
import mastermind.views.console.GameView;
import mastermind.views.console.ProposedCombinationView;

public class ProposalController extends Controller {

	public ProposalController(Session session) {
		super(session);
	}
	
	public void controll() throws CloneNotSupportedException {
		Error error;
		ProposedCombinationView proposedCombinationView = 
				((ProposedCombinationView) this.viewPrototype.creater(TypeView.PROPOSEDCOMBINATION));
		ErrorView errorView = ((ErrorView) this.viewPrototype.creater(TypeView.ERROR));
		do {
			List<Color> colors = proposedCombinationView.read();
			error = this.addProposedCombination(colors);
			if (error != null) {
				errorView.writeln(error);
			}
		} while (error != null);
		
		proposedCombinationView.writeln();
		((GameView) this.viewPrototype.creater(TypeView.GAME)).writeln(this.session, this.viewPrototype);
		
		if (this.session.isWinner()) {
			proposedCombinationView.writeln(MessageView.WINNER.getMessage());
			this.session.next();
		} else if (this.session.isLooser()) {
			proposedCombinationView.writeln(MessageView.LOOSER.getMessage());
			this.session.next();
		}
	}

	public Error addProposedCombination(List<Color> colors) {
		Error error = null;
		if (colors.size() != Combination.getWidth()) {
			error = Error.WRONG_LENGTH;
		} else {
			for (int i = 0; i < colors.size(); i++) {
				if (colors.get(i) == null) {
					error = Error.WRONG_CHARACTERS;
				} else {
					for (int j = i+1; j < colors.size(); j++) {
						if (colors.get(i) == colors.get(j)) {
							error = Error.DUPLICATED;
						}
					}
				}				
			}
		}
		if (error == null){
			this.session.addGameProposedCombination(colors);
		}
		return error;	
	}

}
