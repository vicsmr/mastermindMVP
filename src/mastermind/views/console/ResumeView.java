package mastermind.views.console;

import mastermind.views.MessageView;
import mastermind.views.View;
import santaTecla.utils.YesNoDialog;

public class ResumeView extends View {

	public ResumeView() {
	}

	public boolean newGame() {
		return new YesNoDialog().read(MessageView.RESUME.getMessage());
	}

}
