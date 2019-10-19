package mastermind.controllers;

import mastermind.models.Session;
import mastermind.types.TypeView;
import mastermind.views.console.SecretCombinationView;
import mastermind.views.console.StartView;

public class StartController extends Controller {

	public StartController(Session session) {
		super(session);
	}
	
	public void controll() throws CloneNotSupportedException {
		((StartView) this.viewPrototype.creater(TypeView.START)).showTitle();
		((SecretCombinationView) this.viewPrototype.creater(TypeView.SECRETCOMBINATION))
		.writeln(this.session.getGameWidth());
		this.session.next();
	}

}
