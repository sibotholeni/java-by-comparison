package avoidswitchfallthrough.correct;

public class BoardComputer {
	
	CruiseControl cruiseControl;
	
	void authorize(User user) {
		Objects.requireNonNull(user);
		switch (user.getRank()) {
			case UNKNOWN:
				cruiseControl.logUnauthorizedAccessAttempt();
				break;	// fix for previous bug
			case ASTRONAUT:
				cruiseControl.grantAccess(user);
				break;
			case COMMANDER:
				cruiseControl.grantAccess(user);
				cruiseControl.grantAdminAccess(user);
				break;
		}
	}
}