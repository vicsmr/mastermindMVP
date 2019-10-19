package mastermind.views;

import java.util.HashMap;
import java.util.Map;

import mastermind.types.TypeView;
import mastermind.views.console.AttemptsView;
import mastermind.views.console.ErrorView;
import mastermind.views.console.GameView;
import mastermind.views.console.ProposedCombinationView;
import mastermind.views.console.ResultView;
import mastermind.views.console.ResumeView;
import mastermind.views.console.SecretCombinationView;
import mastermind.views.console.StartView;

public class ViewPrototype {
	
	private Map<TypeView, View> mapTypeViews;
	
	public ViewPrototype() {
		mapTypeViews = new HashMap<TypeView, View>();
		mapTypeViews.put(TypeView.START, new StartView());
		mapTypeViews.put(TypeView.PROPOSEDCOMBINATION, new ProposedCombinationView());
		mapTypeViews.put(TypeView.SECRETCOMBINATION, new SecretCombinationView());
		mapTypeViews.put(TypeView.ATTEMPTS, new AttemptsView());
		mapTypeViews.put(TypeView.GAME, new GameView());
		mapTypeViews.put(TypeView.ERROR, new ErrorView());
		mapTypeViews.put(TypeView.RESULT, new ResultView());
		mapTypeViews.put(TypeView.RESUME, new ResumeView());
	}
	
	public View creater(TypeView typeView) throws CloneNotSupportedException {
		return (View) this.mapTypeViews.get(typeView).clone();
	}

}
