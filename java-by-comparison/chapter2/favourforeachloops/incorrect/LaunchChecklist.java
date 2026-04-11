/**
	In the code snippet, the index i is used only for accessing the next element of a list,
	so there is no need to keep track of it.
*/
class LaunchChecklist {
	
	List<String> checks = Arrays.asList("Cabin Pressure", "Communication", "Engine");
	
	Status prepareForTakeoff(Commander commander) {
		for (int i = 0; i < checks.size(); i++) {
			boolean shouldAbortTakeoff = commander.isFailing(checks.get(i));
			if (shouldAbortTakeoff) {
				return Status.ABORT_TAKE_OFF;
			}
		}
		return Status.READY_FOR_TAKE_OFF;
	}
}