package mastermind.views.console;

import mastermind.views.MessageView;
import mastermind.views.View;

public class AttemptsView extends View {

	public AttemptsView() {
	}

	public void writeln(int attempts) {
		this.console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts",
				"" + attempts));
	}
}
