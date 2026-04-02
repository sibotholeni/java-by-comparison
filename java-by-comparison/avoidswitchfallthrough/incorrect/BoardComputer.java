package avoidswitchfallthrough.incorrect;

/**
	
	Objects.requireNonNull() handy validation method which will trigger an exception on null params.
	
	Bug:
	The first case has no break statement at the end, so switch will continue to the next case.
	it falls through and will always execute cruiseControl.grantAccess().
	
*/
public class BoardComputer {
	
	CruiseControl cruiseControl;
	
	void authorize(User user) {
		Objects.requireNonNull(user);
		switch (user.getRank()) {
			case UNKNOWN:
				cruiseControl.logUnauthorizedAccessAttempt();
			case ASTRONAUT:
				cruiseControl.grantAccess(user);
				break;
			case COMMANDER:
				cruiseControl.grantAccess(user);
				cruiseControl.grantAdminAccess(user);
				break
		}
	}
}