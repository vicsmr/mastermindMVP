package mastermind.views.console;

import mastermind.views.MessageView;
import mastermind.views.View;

public class StartView extends View {
	
	public StartView () {
	}

	public void showTitle() {
		this.console.writeln(MessageView.TITLE.getMessage());
	}

}
