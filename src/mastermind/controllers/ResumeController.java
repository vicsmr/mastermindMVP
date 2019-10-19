package mastermind.controllers;

import mastermind.models.Session;
import mastermind.types.TypeView;
import mastermind.views.console.ResumeView;

public class ResumeController extends Controller {

	public ResumeController(Session session) {
		super(session);
	}
	
	public void controll() throws CloneNotSupportedException {
		if (((ResumeView) viewPrototype.creater(TypeView.RESUME)).newGame()) {
			this.session.resume();
		} else {
			this.session.next();
		}
	}

}
