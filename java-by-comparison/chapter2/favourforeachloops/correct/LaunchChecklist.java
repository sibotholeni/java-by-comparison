/**
	Most of the time, you don't need the level of detail that an index variable gives you.
	In those cases you should write loops in a different way, such that the low-level details
	of the iteration aren't just protected but are also hidden from the programmer.
	
	This make your software safer and easier to understand.
*/
class LaunchChecklist {
	
	List<String> checks = Arrays.asList("Cabin Pressure", "Communication", "Engine");
	
	Status prepareForTakeoff(Commander commander) {
		for (String check : checks) {
			boolean shouldAbortTakeoff = commander.isFailing(check);
			if (shouldAbortTakeoff) {
				return Status.ABORT_TAKE_OFF;
			}
		}
		return Status.READY_FOR_TAKE_OFF;
	}
}