package mastermind;

import java.util.HashMap;
import java.util.Map;

import mastermind.controllers.Controller;
import mastermind.controllers.ProposalController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.models.Session;
import mastermind.types.State;

public class Mastermind {
	
	Map<State, Controller> controllers;

	private Session session;

	protected Mastermind() {
		this.session = new Session();
		this.controllers = new HashMap<State, Controller>();
		this.controllers.put(State.START, new StartController(this.session));
		this.controllers.put(State.PROPOSAL, new ProposalController(this.session));
		this.controllers.put(State.RESUME, new ResumeController(this.session));
		this.controllers.put(State.EXIT, null);
	}

	private void play() {
		Controller controller;
		do {
			controller = this.controllers.get(this.session.getState());
			if (controller != null) {
				try {
					controller.controll();
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
					System.exit(0);
				}
			}
		} while(controller != null);
	}
	
	public static void main(String[] args) {
		new Mastermind().play();
	}

}
