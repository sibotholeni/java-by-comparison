package alwaysusebraces.incorrect;

/**
	There are no curly brackets in the conditions in the authorize method.
	So the indentation on the last condition is misleading, as if you assume the second line after the condition
	will only execute based on the condition.
	In this case the {@code cruiseControl.grantAccess(user)} will always execute.
*/
public class BoardComputer {
	
	CruiseControl cruiseControl;
	
	void authorize(User user) {
		Objects.requireNonNull(user);
		
		if (user.isUnknown())
			cruiseControl.logUnauthorizedAccessAttempt();
		if (user.isAstronaut())
			cruiseControl.grantAccess(user);
		if (user.isCommander())
			cruiseControl.grantAccess(user);
			cruiseControl.grantAccess(user);
	}
}