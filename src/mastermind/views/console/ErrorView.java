package mastermind.views.console;

import mastermind.types.Error;
import mastermind.views.ColorView;
import mastermind.views.View;
import santaTecla.utils.Console;

public class ErrorView extends View {
	
	public static final String[] MESSAGES = { 
			"Repeated colors",
			"Wrong colors, they must be: " + ColorView.allInitials(), 
			"Wrong proposed combination length" };

	public ErrorView() {
	}
	
	public void writeln(Error error) {
		new Console().writeln(ErrorView.MESSAGES[error.ordinal()]);
	}	

}
