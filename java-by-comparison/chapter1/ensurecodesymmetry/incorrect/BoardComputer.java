
/**
	The code is not symmetry because it is mixing authorization code with non-authorizing code.
	conde symmetry can be improved by separating the different blocks of code, see correct version
*/

public class BoardComputer {
	
	CruiseControl cruiseControl;
	
	void authorize(User user) {
		Objects.requireNonNull(user);
		
		if (user.isUnkown()) {
			cruiseControl.logUnauthorizedAccessAttempt();
		} else if (user.isAstronaut()) {
			cruiseControl.grantAccess(user);
		} else if (user.isCommander()) {
			cruiseControl.grantAccess(user);
			cruiseControl.grantAdminAccess(user);
		}
	}
}