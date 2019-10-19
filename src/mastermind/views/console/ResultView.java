package mastermind.views.console;

import mastermind.views.MessageView;
import mastermind.views.View;

public class ResultView extends View {

	public ResultView() {
	}

	public void writeln(int blacks, int whites) {
		this.console.writeln(MessageView.RESULT.getMessage()
				.replaceFirst("#blacks", "" + blacks)
						.replaceFirst("#whites", "" + whites));
	}

}
