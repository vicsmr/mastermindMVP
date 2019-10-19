package mastermind.controllers;

import mastermind.models.Session;
import mastermind.views.ViewPrototype;

public abstract class Controller {

	protected Session session;
	
	protected ViewPrototype viewPrototype;

	Controller(Session session) {
		this.session = session;
		this.viewPrototype = new ViewPrototype();
	}
	
	public abstract void controll() throws CloneNotSupportedException;

}
