public class BoardComputer {
	
	CruiseControl cruiseControl;
	
	void authorize(User user) {
		Objects.requireNonNull(user);
		
		if (user.isUnknown()) {
			cruiseControl.logUnauthorizedAccessAttempt();
			return;
		}
		
		// This part is now symmetrical as it contains 2 types of authorized access.
		if (user.isAstronaut()) {
			cruiseControl.grantAccess(user);
		} else if (user.isCommander()) {
			cruiseControl.grantAccess(user);
			cruiseControl.grantAdminAccess(user);
		}
	}
}